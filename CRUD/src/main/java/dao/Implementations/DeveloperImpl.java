package dao.Implementations;

import dao.daos.DeveloperDAO;
import model.Developer;
import util.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperImpl implements DeveloperDAO {
  public Developer create(Developer dev) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;

    if (getDeveloperID(dev.getName(), connection) == -1) {
      try {
        statement = connection.prepareStatement("INSERT INTO mydb.developers(name, level, salary) values(?,?,?)");
        statement.setString(1, dev.getName());
        statement.setString(2, dev.getLevel());
        statement.setInt(3, dev.getSalary());
        statement.execute();
        System.out.println("Successfully added!");
        return dev;
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return read(dev.getId());
  }

  private int getDeveloperID(String devName, Connection connection) {
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT id FROM mydb.developers WHERE name = ?");
      statement.setString(1, devName);
      ResultSet result = statement.executeQuery();
      if (result.next()) return result.getInt(1);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  public void addSkill(Developer developer) {
    Connection connection = Utils.getConnection();
    Scanner sc = new Scanner(System.in);
    int id;
    System.out.println("Choose skill id for adding to developer: ");
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.skills");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) System.out.println(rs.getInt(1) + " - " + rs.getString(2));
      id = sc.nextInt();
      if(developer.getSkills().contains(id)) throw new SQLException();
      developer.addSkill(id);
      PreparedStatement statement1 = connection.prepareStatement("INSERT INTO mydb.developers_has_skills(developers_id, skills_id) values(?, ?)");
      statement1.setInt(1, developer.getId());
      statement1.setInt(2, id);
      statement1.execute();
      System.out.println("Skill successfully added.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void setSkillsForDeveloper(Developer dev) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;
    try {
      statement = connection.prepareStatement("SELECT skills_id FROM mydb.developers_has_skills WHERE developers_id = ?");
      statement.setInt(1, dev.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) dev.addSkill(rs.getInt(1));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Developer read(int id) {
    try {
      Connection connection = Utils.getConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.developers WHERE id = ?");
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        Developer developer;
        int devID = rs.getInt(1);
        String name = rs.getString(2);
        String level = rs.getString(3);
        int salary = rs.getInt(4);
        developer = new Developer(name, level, salary);
        developer.setId(devID);
        return developer;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void update(int id, Developer dev) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("UPDATE mydb.developers SET name = ?, level = ?, salary = ? WHERE id = ?");
      statement.setString(1, dev.getName());
      statement.setString(2, dev.getLevel());
      statement.setInt(3, dev.getSalary());
      statement.setInt(4, id);

      statement.executeUpdate();
      System.out.println("Successfully updated!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete(int id) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("DELETE  FROM mydb.developers_has_skills WHERE developers_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE  FROM mydb.developers_has_projects WHERE developers_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE FROM mydb.developers WHERE id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      System.out.println("Successfully deleted!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Developer> getAllDevelopers() {
    List<Developer> list = new ArrayList<Developer>();
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.developers");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String level = rs.getString(3);
        int salary = rs.getInt(4);
        Developer developer = new Developer(name, level, salary);
        developer.setId(id);
        setSkillsForDeveloper(developer);
        list.add(developer);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
