package module_2_10.MyShape;

import java.util.Comparator;
import java.util.StringTokenizer;

public class Circles extends Shapes implements Drawable, Comparable<Circles>, Comparator<Shapes>{
  private double radius;

  public Circles(String shapeColor, double radius) {
    super(shapeColor);
    this.radius = radius;
  }

  public void setRadius(double radius) {
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
  public int compareTo(Circles o) {
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

  public static Circles parseCircle(String str) {
    StringTokenizer ST = new StringTokenizer(str, ":,");
    Circles shape = new Circles("Black", 0);
    double rad = 0;
    String color = "";
    int i = 1;
    while (ST.hasMoreElements()) {
      switch (i) {
        case 1:
          System.out.println("This is Circle!");break;
        case 2: color = (String) ST.nextElement();break;
        default: rad = (double) ST.nextElement();break;
      }
      i++;
    }

    //shape.setShapeColor(color);
    shape.setRadius(rad);

    return shape;
  }
}
