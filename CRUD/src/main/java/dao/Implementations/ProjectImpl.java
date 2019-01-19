package dao.Implementations;

import dao.daos.ProjectDAO;
import model.Project;
import util.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectImpl implements ProjectDAO {
  public Project create(Project project) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;

    if(getProjectID(project.getName(), connection) == -1)
      try {
        statement = connection.prepareStatement("INSERT INTO mydb.projects(project_name, cost) values (?, ?)");
        statement.setString(1, project.getName());
        statement.setInt(2, project.getCost());
        statement.execute();
        System.out.println("Successfully added!");
        return project;
      } catch (SQLException e) {
        e.printStackTrace();
      }

    return read(project.getId());
  }

  private int getProjectID(String name, Connection connection) {
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT id FROM mydb.projects WHERE project_name = ?");
      statement.setString(1, name);
      ResultSet result = statement.executeQuery();
      if (result.next()) return result.getInt(1);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  public void addDeveloperOnProject(Project project) {
    Connection connection = Utils.getConnection();
    System.out.println("Choose developer ( id ) for the project:");
    int id;
    Scanner sc = new Scanner(System.in);
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT name, id FROM mydb.developers");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) System.out.println(rs.getInt(2) + " - " + rs.getString(1));
      id = sc.nextInt();
      if(project.getDevelopers().contains(id)) throw new SQLException();
      project.setDevelopers(id);
      PreparedStatement statement1 = connection.prepareStatement("INSERT INTO mydb.developers_has_projects(developers_id, projects_id) VALUES(?, ?)");
      statement1.setInt(1, id);
      statement1.setInt(2, project.getId());
      statement1.execute();
      System.out.println("New developer successfully added!");
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public Project read(int id) {
    try {
      Connection connection = Utils.getConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.projects WHERE id = ?");
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      if(rs.next()) {
        int prID = rs.getInt(1);
        String name = rs.getString(2);
        int cost = rs.getInt(3);
        Project project = new Project(name, cost);
        project.setId(prID);
        return project;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void update(int id, Project project) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("UPDATE mydb.projects SET project_name = ?, cost = ? WHERE id = ?");
      statement.setString(1, project.getName());
      statement.setInt(2, project.getCost());
      statement.setInt(3, id);

      statement.executeUpdate();
      System.out.println("Successfully updated!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete(int id) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("DELETE  FROM mydb.developers_has_projects WHERE projects_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE  FROM mydb.projects_has_companies WHERE projects_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE  FROM mydb.projects_has_customers WHERE projects_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE  FROM mydb.projects WHERE id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      System.out.println("Successfully deleted!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void setDevelopersOnProject(Project pr) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT developers_id FROM mydb.developers_has_projects WHERE projects_id = ?");
      statement.setInt(1, pr.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) pr.setDevelopers(rs.getInt(1));
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public List<Project> getAllProjects() {
    List<Project> list = new ArrayList<Project>();
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.projects");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        int cost = rs.getInt(3);
        Project project = new Project(name, cost);
        project.setId(id);
        setDevelopersOnProject(project);
        list.add(project);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
