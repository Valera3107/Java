package module_03;

public class Rectangle {
  private double width;
  private double length;

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle( ) {
    this.width = 20.0;
    this.length = 30.0;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void calcArea() {
    System.out.println("Area of the rectangle = " + (getLength() * getWidth()));
  }

  public void calcPerimeter() {
    System.out.println("Perimeter of the rectangle = " + (2 * (getWidth() + getLength())));
  }
}
