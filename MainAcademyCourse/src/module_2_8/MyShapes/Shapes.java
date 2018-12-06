package module_2_8.MyShapes;

public abstract class Shapes implements Drawable{
  private String shapeColor;

  public Shapes(String shapeColor) {
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

  public abstract double calcArea();
}
