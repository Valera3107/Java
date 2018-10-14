package module_2_2;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private int phoneNumber;

  public Person(String firstName, String lastName, int age, String gender, int phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void set(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void set(String firstName) {
    this.firstName = firstName;
  }

  public void set(String firstName, String lastName, String gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
  }

  public void set(int age) {
    this.age = age;
  }

  public void set(int age, int phoneNumber) {
    this.age = age;
    this.phoneNumber = phoneNumber;
  }
}
