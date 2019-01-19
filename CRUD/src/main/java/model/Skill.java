package model;

import java.util.ArrayList;
import java.util.List;

public class Skill {
  private int id;
  private String language;
  private List<Integer> developers = new ArrayList<Integer>();

  public void setId(int id) {
    this.id = id;
  }

  public List<Integer> getDevelopers() {
    return developers;
  }

  public void setDevelopers(int id) {
    developers.add(id);
  }

  public Skill(String language) {
    this.language = language;
  }

  public int getId() {
    return id;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String toString() {
    return "Skill{" +
      "id=" + id +
      ", language='" + language + '\'' +
      ", developers=" + developers +
      '}';
  }
}
