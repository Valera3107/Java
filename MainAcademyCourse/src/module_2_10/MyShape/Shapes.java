package module_2_10.MyShape;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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

  public static Shapes parseShape(String str) {
    StringTokenizer ST = new StringTokenizer(str, ":,");
    Shapes shape = null;
    List list = new ArrayList();
    String color = "";
    String shapeName = "";
    int i = 1;
    while (ST.hasMoreElements()) {
      switch (i) {
        case 1: shapeName = (String) ST.nextElement();break;
        case 2: color = (String) ST.nextElement();break;
        default: list.add(Double.parseDouble((String) ST.nextElement()));break;
      }
      i++;
    }

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    if(shapeName == "Circle") {
      shape = new Circles(color,(double) list.get(0));
    }
    if(shapeName == "Rectangle") {
      shape = new Rectangle(color, (double) list.get(0),(double) list.get(1));
    }
    if(shapeName == "Triangle") {
      shape = new Triangle(color, (double) list.get(0),(double) list.get(1),(double) list.get(2));
    }

    return shape;
  }
}
