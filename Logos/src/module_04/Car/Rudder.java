package module_04.Car;

public class Rudder {
  private double diameter;
  private String material;
  private String mark;

  public Rudder(double diameter, String material, String mark) {
    this.diameter = diameter;
    this.material = material;
    this.mark = mark;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public void changeMark(String newMark) {
    this.setMark(newMark);
  }

  public void increaseDiameterX2() {
    setDiameter(getDiameter() * 2);
  }

  @Override
  public String toString() {
    return "Rudder{" +
      "diameter=" + diameter +
      ", material='" + material + '\'' +
      ", mark='" + mark + '\'' +
      '}';
  }
}
