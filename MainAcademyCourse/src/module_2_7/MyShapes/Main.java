package module_2_7.MyShapes;

public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape("RED");
    Circle circle = new Circle("Green", 12);
    Rectangle rectangle = new Rectangle("RED", 10,15);
    Triangle triangle = new Triangle("Black", 4, 6, 5);

    System.out.println(triangle.toString());
    System.out.println("-------------");
    System.out.println(rectangle.toString());
    System.out.println("-------------");
    System.out.println(circle.toString());
    System.out.println("-------------");
    System.out.println(shape.toString());

    Shape[] shapesArr = {new Circle("Orange", 6.7), new Circle("Black", 9.3),
    new Rectangle("Red", 23.5,4.9), new Rectangle("Blue", 45, 34.6),
    new Triangle("Yellow", 5, 6, 7), new Triangle("Brown", 6.7, 4.5, 8.2)};

    for (Shape elem:
         shapesArr) {
      System.out.println(elem.toString());
    }
  }
}
