package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private int id;
  private String name;
  private int profit;
  private List<Integer> projects = new ArrayList<Integer>();

  public Customer(String name, int profit) {
    this.name = name;
    this.profit = profit;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Integer> getProjects() {
    return projects;
  }

  public void setProjects(int id) {
    projects.add(id);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProfit(int profit) {
    this.profit = profit;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getProfit() {
    return profit;
  }

  @Override
  public String toString() {
    return "Customer{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", profit=" + profit +
      ", projects=" + projects +
      '}';
  }
}
