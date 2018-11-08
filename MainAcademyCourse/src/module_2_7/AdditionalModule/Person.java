package module_2_7.AdditionalModule;

public class Person {
  private String name;
  private int age;
  private String gender;
  private int yearOfBirth;
  private Dog dog;

  public Person(String name, int age, String gender, int yearOfBirth, Dog dog) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.yearOfBirth = yearOfBirth;
    this.dog = dog;
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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public Dog getDog() {
    return dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }
}
