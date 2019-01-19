package model;

import java.util.ArrayList;
import java.util.List;

public class Developer {
  private int id;
  private String name;
  private String level;
  private int salary;
  private List<Integer> skillId = new ArrayList<Integer>();

  public Developer(String name, String level, int salary) {
    this.name = name;
    this.level = level;
    this.salary = salary;
  }

  public List<Integer> getSkills() {
    return skillId;
  }

  public void addSkill(int id) {
    skillId.add(id);
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getLevel() {
    return level;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Developer{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", level='" + level + '\'' +
      ", salary=" + salary +
      ", skillId=" + skillId +
      '}';
  }
}
