package module_2_10.MyShape;

import java.util.Comparator;

public class Rectangle extends Shapes implements Drawable, Comparable<Rectangle>, Comparator<Shapes>{
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

  @Override
  public void draw() {
    System.out.println("Area of Rectangle " + this.calcArea() + " additional info: " + this.toString());
  }

  @Override
  public int compareTo(Rectangle o) {
    if(this.calcArea() > o.calcArea()){
      return 1;
    } else if(this.calcArea() < o.calcArea()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public int compare(Shapes o1, Shapes o2) {
    if(o1.getShapeColor().compareTo(o1.getShapeColor()) != 0)
    {
      return o1.getShapeColor().compareTo(o1.getShapeColor());
    }
    return 0;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }
}
