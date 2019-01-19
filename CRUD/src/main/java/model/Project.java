package model;

import java.util.ArrayList;
import java.util.List;

public class Project {
  private int id;
  private String name;
  private int cost;
  private List<Integer> developers = new ArrayList<Integer>();

  public Project(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Integer> getDevelopers() {
    return developers;
  }

  public void setDevelopers(int id) {
    developers.add(id);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getCost() {
    return cost;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "Project{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", cost=" + cost +
      ", developers=" + developers +
      '}';
  }
}
