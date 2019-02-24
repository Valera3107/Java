package module_04.Car;

public class Wheel {
  private double diameter;
  private String mark;
  private double width;

  public Wheel(double diameter, String mark, double width) {
    this.diameter = diameter;
    this.mark = mark;
    this.width = width;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void increaseWheelX2() {
    setDiameter(getDiameter() * 2);
    setWidth(getWidth() * 2);
  }

  public void changeMark(String newMark){
    this.setMark(newMark);
  }

  @Override
  public String toString() {
    return "Wheel{" +
      "diameter=" + diameter +
      ", mark='" + mark + '\'' +
      ", width=" + width +
      '}';
  }
}
