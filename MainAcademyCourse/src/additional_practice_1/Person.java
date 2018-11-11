package additional_practice_1;

public class Person {
  private String id;
  private String FirstName;
  private String LastName;
  private int age;
  private String sex;
  private String city;
  private String work;
  private int salary;
  private Animal animal;

  public Person(String id, String firstName, String lastName, int age, String sex, String city, String work, int salary, Animal animal) {
    this.id = id;
    FirstName = firstName;
    LastName = lastName;
    this.age = age;
    this.sex = sex;
    this.city = city;
    this.work = work;
    this.salary = salary;
    this.animal = animal;
  }

  @Override
  public String toString() {
    return "Person{" +
      "id='" + id + '\'' +
      ", FirstName='" + FirstName + '\'' +
      ", LastName='" + LastName + '\'' +
      ", age=" + age +
      ", sex='" + sex + '\'' +
      ", city='" + city + '\'' +
      ", work='" + work + '\'' +
      ", salary=" + salary +
      ", animal=" + animal +
      '}' + "\n";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
