package module_2_10.MyShape;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

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

  public void setA(double a) {
    this.a = a;
  }

  public void setB(double b) {
    this.b = b;
  }

  public void setC(double c) {
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

  public static Triangle parseTriangle(String str) {
    StringTokenizer ST = new StringTokenizer(str, ":,");
    Triangle shape = new Triangle("Black", 0,0,0);
    List list = new ArrayList<>();
    String color = "";
    int i = 1;
    while (ST.hasMoreElements()) {
      switch (i) {
        case 1:
          System.out.println("This is Triangle!");break;
        case 2: color = (String) ST.nextElement();break;
        default: list.add(Double.parseDouble((String) ST.nextElement()));break;
      }
      i++;
    }

    shape.setShapeColor(color);
    shape.setA((double) list.get(0));
    shape.setB((double) list.get(1));
    shape.setC((double) list.get(2));
    return shape;
  }
}

