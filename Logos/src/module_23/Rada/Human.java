package module_23.Rada;

import java.util.Arrays;

public class Human {
  private int age;
  private double height;
  private String[] gentlemansSet;

  public Human(int age, double height, String[] gentlemansSet) {
    this.age = age;
    this.height = height;
    this.gentlemansSet = gentlemansSet;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String[] getGentlemansSet() {
    return gentlemansSet;
  }

  public void setGentlemansSet(String[] gentlemansSet) {
    this.gentlemansSet = gentlemansSet;
  }

  @Override
  public String toString() {
    return "Human{" +
      "age=" + age +
      ", height=" + height +
      ", gentlemansSet=" + Arrays.toString(gentlemansSet) +
      '}';
  }
}
