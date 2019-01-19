package dao.Implementations;

import dao.daos.CustomerDAO;
import model.Customer;
import util.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements CustomerDAO {
  public Customer create(Customer cust) {
    Connection connection = Utils.getConnection();
    PreparedStatement statement;

    if (getCustomerID(cust.getName(), connection) == -1)
      try {
        statement = connection.prepareStatement("INSERT INTO mydb.customers(name, profit) values (?, ?)");
        statement.setString(1, cust.getName());
        statement.setInt(2, cust.getProfit());
        statement.execute();
        System.out.println("Successfully added!");
        return cust;
      } catch (SQLException e) {
        e.printStackTrace();
      }

    return read(cust.getId());
  }

  private int getCustomerID(String name, Connection connection) {
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT id FROM mydb.customers WHERE name = ?");
      statement.setString(1, name);
      ResultSet result = statement.executeQuery();
      if (result.next()) return result.getInt(1);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return -1;
  }

  public Customer read(int id) {
    try {
      Connection connection = Utils.getConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.customers WHERE id = ?");
      statement.setInt(1, id);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        int compID = rs.getInt(1);
        String name = rs.getString(2);
        int profit = rs.getInt(3);
        Customer customer = new Customer(name, profit);
        customer.setId(compID);
        return customer;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void update(int id, Customer cust) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("UPDATE mydb.customers SET name = ?, profit = ? WHERE id = ?");
      statement.setString(1, cust.getName());
      statement.setInt(2, cust.getProfit());
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
      PreparedStatement statement = connection.prepareStatement("DELETE  FROM mydb.projects_has_customers WHERE customers_id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      statement = connection.prepareStatement("DELETE FROM mydb.customers WHERE id = ?");
      statement.setInt(1, id);
      statement.executeUpdate();
      System.out.println("Successfully deleted!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void customerHaveProject(Customer customer) {
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT projects_id FROM mydb.projects_has_customers WHERE customers_id = ?");
      statement.setInt(1, customer.getId());
      ResultSet rs = statement.executeQuery();
      while (rs.next()) customer.setProjects(rs.getInt(1));
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public void addProjectToCustomer(Customer customer) {
    Connection connection = Utils.getConnection();
    Scanner sc = new Scanner(System.in);
    int id;
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.projects");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
      id = sc.nextInt();
      if(customer.getProjects().contains(id)) throw new SQLException();
      customer.setProjects(id);
      statement = connection.prepareStatement("INSERT INTO mydb.projects_has_customers(projects_id, customers_id) VALUES(?, ?)");
      statement.setInt(1, id);
      statement.setInt(2, customer.getId());
      statement.execute();
      System.out.println("New project successfully added!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }


  public List<Customer> getAllCustomers() {
    List<Customer> list = new ArrayList<Customer>();
    Connection connection = Utils.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM mydb.customers");
      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        int profit = rs.getInt(3);
        Customer customer = new Customer(name, profit);
        customer.setId(id);
        customerHaveProject(customer);
        list.add(customer);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
