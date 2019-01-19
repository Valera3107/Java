package dao.Implementations;

import dao.daos.CompanyDAO;
import model.Company;
import util.Utils;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyImpl implements CompanyDAO {

  public Company create(Company comp) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;

    if (getCompanyID(comp.getName(), connection) == -1)
      try {
        statement = connection.prepareStatement("INSERT INTO mydb.companies(name, size) values (?, ?)");
        statement.setString(1, comp.getName());
        statement.setString(2, comp.getSize());
        statement.execute();
        System.out.println("Successfully added!");
        return comp;
      } catch (SQLException e) {
        e.printStackTrace();
      }

    return read(comp.getId());
  }

  private int getCompanyID(String name, Connection connection) {
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT id FROM mydb.companies WHERE name = ?");
      statement.setString(1, name);
      ResultSet result = statement.executeQuery();
      if (result.next()) return result.getInt(1);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  public Company read(int id) {
    try {
      Connection connection = Utils.getConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.companies WHERE id = ?");
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        int compID = rs.getInt(1);
        String name = rs.getString(2);
        String size = rs.getString(3);
        Company company = new Company(name, size);
        company.setId(compID);
        return company;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void addProjectToTheCompany(Company company) {
    Connection connection = Utils.getConnection();
    Scanner sc = new Scanner(System.in);
    int id;
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.projects");
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next())
        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
      id = sc.nextInt();
      if (company.getProjects().contains(id)) throw new SQLException();
      company.setProjects(id);
      statement = connection.prepareStatement("INSERT INTO mydb.projects_has_companies(projects_id, companies_id) VALUES(?, ?)");
      statement.setInt(1, id);
      statement.setInt(2, company.getId());
      statement.execute();
      System.out.println("Project successfully added!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void update(int id, Company comp) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("UPDATE mydb.companies SET name = ?, size = ? WHERE id = ?");
      statement.setString(1, comp.getName());
      statement.setString(2, comp.getSize());
      statement.setInt(3, id);

      statement.executeUpdate();
      System.out.println("Successfully updated!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void setCompaniesOnProject(Company company) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement = null;
    try {
      statement = connection.prepareStatement("SELECT projects_id FROM mydb.projects_has_companies WHERE companies_id = ?");
      statement.setInt(1, company.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) company.setProjects(rs.getInt(1));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }


  public void delete(int id) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("DELETE  FROM mydb.projects_has_companies WHERE companies_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE FROM mydb.companies WHERE id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      System.out.println("Successfully deleted!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Company> getAllCompanies() {
    List<Company> list = new ArrayList<Company>();
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.companies");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String size = rs.getString(3);
        Company company = new Company(name, size);
        company.setId(id);
        setCompaniesOnProject(company);
        list.add(company);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
