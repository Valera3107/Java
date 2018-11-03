package module_2_7.MyShapes;

public class Shape {
  private String shapeColor;

  public Shape(String shapeColor) {
    this.shapeColor = shapeColor;
  }

  @Override
  public String toString() {
    return "This is shape, color is: " + this.getShapeColor() + "\n" + "Shape area is: " + this.calcArea();
  }

  public String getShapeColor() {
    return shapeColor;
  }

  public void setShapeColor(String shapeColor) {
    this.shapeColor = shapeColor;
  }

  public double calcArea(){return 0.0;}
}
