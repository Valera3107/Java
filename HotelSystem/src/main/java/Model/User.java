package Model;

import Service.Utils;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
  private String name;
  private int age;
  private int id;
  private boolean haveRoom;

  public User(String name, int age) {
    this.name = name;
    this.haveRoom = false;
    this.age = age;
    this.id = Utils.generateId();
  }

  public boolean isHaveRoom() {
    return haveRoom;
  }

  public void setHaveRoom(boolean haveRoom) {
    this.haveRoom = haveRoom;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return getId() == user.getId() &&
      Objects.equals(getName(), user.getName()) &&
      Objects.equals(getAge(), user.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge(), getId());
  }

  @Override
  public String toString() {
    return "User{" +
      "name = '" + name + '\'' +
      ", age = " + age +
      ", id = " + id +
      ", haveRoom = " + haveRoom +
      '}';
  }
}
