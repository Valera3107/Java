package module_2_8.MyShapes;

import java.util.Comparator;

public class Triangle extends Shapes implements Comparable<Triangle>, Comparator<Shapes>{
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

  @Override
  public int compareTo(Triangle o) {
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

  @Override
  public void draw() {
    System.out.println("Area of Triangle " + this.calcArea() + " additional info: " + this.toString());
  }
}

