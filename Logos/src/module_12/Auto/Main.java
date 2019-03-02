package module_12.Auto;

import module_11.Auto.Car;
import module_11.Auto.Engine;
import module_11.Auto.Wheel;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int length = 3 + (int) (Math.random()*19);
    List<Car[]> array = new ArrayList<>();

    for (int i = 0; i < length; i++) {
      array.add(new Car[length]);
    }

    for (int i = 0; i < array.size(); i++) {
      for (int j = 0; j < array.get(i).length; j++) {
        int year = 2000 + (int) (Math.random() * 2020);
        int horsePower = 100 + (int) (Math.random() * 2000);
        int cylinders = 6 + (int) (Math.random() * 12);
        int diameter = 10 + (int) (Math.random() * 35);
        String str1 = "skin";
        String str2 = "alcantara";
        int choice = 1 + (int) (Math.random() * 2);
        array.get(i)[j] = new Car(year, horsePower, new Engine(cylinders), new Wheel(diameter, (choice == 1 ? str1 : str2)));
      }
    }


    int choice;
    Scanner scanner = new Scanner(System.in);
    boolean isStop = false;
    printMenu();
    while (!isStop){
      choice = scanner.nextInt();
      switch (choice){
        case 1: printArray(array);break;
        case 2: fillHorsePower(array);break;
        case 3: sortUp(array);break;
        case 4: sortDown(array);break;
        case 5: isStop = true;break;
        default:
          System.out.println("Invalid input!!!");break;
      }
    }

  }

  private static void printMenu(){
    System.out.println("1 - print array, 2 - fill horse power, 3 - sort up, 4 - sort down, 5 - stop work");
  }

  private static void printArray(List<Car[]> arr) {

    System.out.println(Arrays.deepToString(arr.toArray()));
  }

  private static void fillHorsePower(List<Car[]> arr) {
    for (Car[] anArr : arr) {
      for (int j = 0; j < anArr.length; j++) {
        anArr[j].setHorsePower(1000);
      }
    }
  }

  private static void sortDown(List<Car[]> arr) {
    System.out.println("1 - Horse power, 2 - created at, 3 - cylinder, 4 - diameter, 5 - material");
    Scanner scanner = new Scanner(System.in);
    int index = scanner.nextInt();
    for (int i = 0; i < arr.size(); i++) {
      Arrays.sort(arr.get(i), new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
          switch (index) {
            case 1:
              return o1.getHorsePower() - o2.getHorsePower();
            case 2:
              return o1.getCreatedAt() - o2.getCreatedAt();
            case 3:
              return o1.getEngine().getNumberOfCylinders() - o2.getEngine().getNumberOfCylinders();
            case 4:
              return o1.getWheel().getDiameter() - o2.getWheel().getDiameter();
            case 5:
              return o1.getWheel().getMaterial().compareTo(o2.getWheel().getMaterial());
            default:
              System.out.println("Invalid input");
              return 0;
          }
        }
      });
    }
  }

  private static void sortUp(List<Car[]> arr) {
    System.out.println("1 - Horse power, 2 - created at, 3 - cylinder, 4 - diameter, 5 - material");
    Scanner scanner = new Scanner(System.in);
    int index = scanner.nextInt();
    for (int i = 0; i < arr.size(); i++) {
      Arrays.sort(arr.get(i), new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
          switch (index) {
            case 1:
              return o2.getHorsePower() - o1.getHorsePower();
            case 2:
              return o2.getCreatedAt() - o1.getCreatedAt();
            case 3:
              return o2.getEngine().getNumberOfCylinders() - o1.getEngine().getNumberOfCylinders();
            case 4:
              return o2.getWheel().getDiameter() - o1.getWheel().getDiameter();
            case 5:
              return o2.getWheel().getMaterial().compareTo(o1.getWheel().getMaterial());
            default:
              System.out.println("Invalid input");
              return 0;
          }
        }
      });
    }
  }
}

