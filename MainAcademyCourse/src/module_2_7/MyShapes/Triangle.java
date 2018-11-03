package module_2_7.MyShapes;

public class Triangle extends Shape{
  private double a;
  private double b;
  private double c;

  public Triangle(String shapeColor, double a, double b, double c) {
    super(shapeColor);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  @Override
  public double calcArea() {
    double s = (this.a + this.b + this.c) / 2;
    return Math.pow(s * (s - this.a) * (s - this.b) * (s - this.c),0.5);
  }

  @Override
  public String toString() {
    return "This is Triangle, color: " + this.getShapeColor() + ", a = " + this.getA() + ", b = " + this.getB() + ", c = " + this.getC() + ", area is: " + this.calcArea();
  }
}
