package module_03;

public class Main {
  public static void main(String[] args) {

    Circle circle = new Circle(34.5, 69.0);
    circle.calcArea();
    circle.calcLength();


    Rectangle rectangle = new Rectangle(20.4, 29.7);
    rectangle.calcPerimeter();
    rectangle.calcArea();

    Rectangle rectangle1 = new Rectangle();
    rectangle.calcArea();
    rectangle.calcPerimeter();
  }
}
