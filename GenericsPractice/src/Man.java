public class Man extends Person {
  private final Sex sex;

  public Man(String name, int age, Sex sex) {
    super(name, age);
    this.sex = sex;
  }
}
