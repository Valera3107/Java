package module_04;

import module_04.Animal.Animal;
import module_04.Car.Body;
import module_04.Car.Car;
import module_04.Car.Rudder;
import module_04.Car.Wheel;
import module_04.Robot.CoffeeRobot;
import module_04.Robot.Robot;
import module_04.Robot.RobotCooker;
import module_04.Robot.RobotDancer;

public class Main {
  public static void main(String[] args) {
    //================= 1

//    Robot robot = new Robot();
//    robot.work();
//
//    CoffeeRobot coffeeRobot = new CoffeeRobot();
//    coffeeRobot.work();
//
//    RobotDancer robotDancer = new RobotDancer();
//    robotDancer.work();
//
//    RobotCooker robotCooker = new RobotCooker();
//    robotCooker.work();
//
//    Robot[] robots = {robot, coffeeRobot, robotDancer, robotCooker};
//    for (int i = 0; i < robots.length; i++) {
//      robots[i].work();
//    }

    //======================= 2
//    Wheel wheel = new Wheel(23.5, "BMW", 10.2);
//    Rudder rudder = new Rudder(26.7, "leather", "Mazda");
//    Body body = new Body(205.67, 135.6, "BMW", "leather");
//
//    Car car = new Car(body, wheel, rudder);
//    System.out.println(car.getBody());
//    System.out.println(car.getRudder());
//    System.out.println(car.getWheel());
//
//    car.getWheel().changeMark("Lexus");
//    car.getRudder().changeMark("Ford");
//    car.getBody().changePlating("cloth");
//
//    car.getRudder().increaseDiameterX2();
//    car.getWheel().increaseWheelX2();
//
//    System.out.println(car.getBody());
//    System.out.println(car.getRudder());
//    System.out.println(car.getWheel());
//
//    System.out.println(car);

    //========================== 3
    Animal animal = new Animal("Tiger", 65.6, 19);
    System.out.println(animal);
    System.out.println("\n==========================\n");
    animal.setAge(23);
    animal.setName("Lion");
    animal.setSpeed(54.3);
    System.out.println(animal);
  }
}
