package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

public class Main {
  public static void main(String[] args) {
    Apple apple = new Apple();
    apple.setWeight(3.6);
    System.out.println("Apple: " + apple.getWeight());

    Car car = new Car();
    car.setWeight(45.7);
    System.out.println("Car: " + car.getWeight());
  }
}
