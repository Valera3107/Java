package module_2_7.MyShapes;

public class Circle extends Shape{
  private double radius;

  public Circle(String shapeColor, double radius) {
    super(shapeColor);
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "This is Circle, color: " + this.getShapeColor() + ", radius: " + this.getRadius() + ", area is: " + this.calcArea();
  }

  @Override
  public double calcArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getRadius() {
    return radius;
  }
}
