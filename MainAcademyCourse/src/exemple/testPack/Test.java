package exemple.testPack;

import com.braincad.carPack.Car;
import exemple.applePack.Apple;

public class Test {
  public static void main(String[] args) {
    Apple apple = new Apple(10);
    apple.setMass(12);

    Car car = new Car(1000);
    car.setMass(1200);

    System.out.println("Car weight: " + car.getMass());
    System.out.println("Apple weight: " + apple.getMass());
  }
}
