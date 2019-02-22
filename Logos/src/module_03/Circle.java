package module_03;

public class Circle {
  private double radius;
  private double diameter;

  public Circle(double radius, double diameter) {
    this.radius = radius;
    this.diameter = diameter;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public void calcArea() {
    System.out.println("Area of the circle with diameter " + getDiameter() + " is " + (Math.pow(getDiameter(), 2) / 2));
  }

  public void calcLength() {
    System.out.println("Circle length with radius " + getRadius() + " is " + (2 * Math.PI * getRadius()));
  }
}
