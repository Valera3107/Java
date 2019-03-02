package module_12.Auto;

public class Wheel {
  private int diameter;
  private String material;

  public Wheel(int diameter, String material) {
    this.diameter = diameter;
    this.material = material;
  }

  public int getDiameter() {
    return diameter;
  }

  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "" +
      "diameter=" + diameter +
      ", material='" + material;
  }
}
