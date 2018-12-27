public class Woman extends Person{
  private final Sex sex;

  public Woman(String name, int age, Sex sex) {
    super(name, age);
    this.sex = sex;
  }
}
