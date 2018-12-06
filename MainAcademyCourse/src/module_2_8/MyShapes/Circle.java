package module_2_8.MyShapes;

import java.util.Comparator;

public class Circle extends Shapes implements Drawable, Comparable<Circle>, Comparator<Shapes>{
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

  @Override
  public void draw() {
    System.out.println("Area of Circle " + this.calcArea() + " additional info: " + this.toString());
  }

  @Override
  public int compareTo(Circle o) {
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
    return o1.getShapeColor().compareTo(o1.getShapeColor());
  }

  public double getRadius() {
    return radius;
  }
}
