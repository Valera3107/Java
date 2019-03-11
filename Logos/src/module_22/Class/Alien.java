package module_22.Class;

public class Alien {
  private String planet;
  private String name;
  private int age;
  private int iq;

  public Alien() {
    this("Earth", "Pol");
  }

  public Alien(String planet, String name) {
    this(planet, name, 100, 100);
  }

  public Alien(String planet, String name, int age, int iq) {
    this.planet = planet;
    this.name = name;
    this.age = age;
    this.iq = iq;
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
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

  public int getIq() {
    return iq;
  }

  public void setIq(int iq) {
    this.iq = iq;
  }

  @Override
  public String toString() {
    return "Alien{" +
      "planet='" + planet + '\'' +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", iq=" + iq +
      '}';
  }
}
