package module_2_7.MyShapes;

public class Rectangle extends Shape{
  private double width;
  private double height;

  public Rectangle(String shapeColor, double width, double height) {
    super(shapeColor);
    this.width = width;
    this.height = height;
  }

  @Override
  public double calcArea() {
    return this.width * this.height;
  }

  @Override
  public String toString() {
    return "This is Rectangle, color: " + this.getShapeColor() + ", width: " + this.getWidth() + ", height: " + this.getHeight() + ", area is: " + this.calcArea();
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }
}
