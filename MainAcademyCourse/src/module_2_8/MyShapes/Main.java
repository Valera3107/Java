package module_2_8.MyShapes;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle("Green", 12);
    Rectangle rectangle = new Rectangle("RED", 10,15);
    Triangle triangle = new Triangle("Black", 4, 6, 5);

    System.out.println(triangle.toString());
    System.out.println("-------------");
    System.out.println(rectangle.toString());
    System.out.println("-------------");
    System.out.println(circle.toString());
    System.out.println("-------------");

    Shapes[] shapesArr = {new Circle("Orange", 6.7), new Circle("Black", 9.3),
    new Rectangle("Red", 23.5,4.9), new Rectangle("Blue", 45, 34.6),
    new Triangle("Yellow", 5, 6, 7), new Triangle("Brown", 6.7, 4.5, 8.2)};

    for (Shapes elem:
         shapesArr) {
      System.out.println(elem.toString());
    }

    System.out.println("***___***___***___***");

    for (Shapes elem: shapesArr
         ) {
      elem.draw();
    }

    System.out.println("----------------------------------");

    Rectangle rectangle1 = new Rectangle("Blue", 10, 10);
    Rectangle rectangle2 = new Rectangle("Brown", 12,34);

    System.out.println("Compare result:" + rectangle1.compareTo(rectangle2));

    System.out.println("------------------------------------");

    Rectangle[] arrOfRectangle = {new Rectangle("Red", 23,45), new Rectangle("Orange", 90,54), new Rectangle("Green", 54, 12)};

    Arrays.sort(arrOfRectangle);

    for (Rectangle rect: arrOfRectangle
         ) {
      System.out.println(rect.toString());
    }

    System.out.println("-------------------");

    Arrays.sort(shapesArr);

    for (Shapes shape: shapesArr
         ) {
      System.out.println(shape.toString());
    }

  }
}
