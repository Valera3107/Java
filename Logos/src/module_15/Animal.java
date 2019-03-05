package module_15;

import java.util.Objects;

public class Animal {
  private String type;
  private String name;

  public Animal(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "type='" + type + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Animal)) return false;
    Animal animal = (Animal) o;
    return Objects.equals(getType(), animal.getType()) &&
      Objects.equals(getName(), animal.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getType(), getName());
  }
}
