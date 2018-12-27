public class RichPerson {
  private String name;
  private String lastName;
  private int salary;
  private int age;

  public RichPerson(String name, String lastName, int salary, int age) {
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;
    this.age = age;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "RichPerson{" +
      "name='" + name + '\'' +
      ", lastName='" + lastName + '\'' +
      ", salary=" + salary +
      ", age=" + age +
      '}';
  }
}
