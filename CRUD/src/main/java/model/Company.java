package model;

import java.util.ArrayList;
import java.util.List;

public class Company {
  private int id;
  private String name;
  private String size;
  private List<Integer> projects = new ArrayList<Integer>();

  public Company(String name, String size) {
    this.name = name;
    this.size = size;
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

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "Company{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", size='" + size + '\'' +
      ", projects=" + projects +
      '}';
  }
}
