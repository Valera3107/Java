import javax.swing.*;
import java.util.Objects;

public class Employees {
  private int id;
  private String name;
  private String lastName;
  private int salary;
  private String job;

  public Employees(int id, String name, String lastName, int salary, String job) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;
    this.job = job;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employees)) return false;
    Employees employees = (Employees) o;
    return getId() == employees.getId() &&
      getSalary() == employees.getSalary() &&
      Objects.equals(getName(), employees.getName()) &&
      Objects.equals(getLastName(), employees.getLastName()) &&
      Objects.equals(getJob(), employees.getJob());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName(), getLastName(), getSalary(), getJob());
  }

  @Override
  public String toString() {
    return "Employees{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", lastName='" + lastName + '\'' +
      ", salary=" + salary +
      ", job='" + job + '\'' +
      '}';
  }
}
