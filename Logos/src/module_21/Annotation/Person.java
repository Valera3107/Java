package module_21.Annotation;

import java.io.Serializable;

public class Person implements Serializable{

  @FileWrite(params = true)
  private String name;

  @FileWrite(params = true)
  private String surname;

  @FileWrite()
  private int age;

  @FileWrite(params = true)
  private int salary;

  public Person() {
    name = null;
    surname = null;
    age = 0;
    salary = 0;
  }

  public Person(String name, String surname, int age, int salary) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", surname='" + surname + '\'' +
      ", age=" + age +
      ", salary=" + salary +
      '}';
  }
}
