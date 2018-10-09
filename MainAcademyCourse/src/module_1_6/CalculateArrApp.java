package module_1_6;

import java.util.Scanner;

public class CalculateArrApp {
  public static void main(String[] args) {
    int[] arr = {22, 54, 66, 1, 342, 67, 98, 6, 0};

    boolean continueAsks = true;
    Scanner scanner = new Scanner(System.in);


    while (continueAsks) {
      System.out.println("Choose operation: 1 - max, 2 - min, 3 - average");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          int max = 0;
          for (int var : arr) {
            if (var > max) {
              max = var;
            }
          }
          System.out.println("Max value of array: " + max);
          break;
        case 2:
          int min = 0;
          for (int var : arr) {
            if (var < min) {
              min = var;
            }
          }
          System.out.println("Min value of array: " + min);
          break;
        case 3:
          int aver = 0;
          int sum = 0;
          for (int var : arr) {
            sum += var;
          }
          aver = (int) sum / arr.length;
          System.out.println("Average value of array: " + aver);
          break;
        default:
          System.out.println("Try again.");break;
      }
      System.out.println("Do you want to try again ? (write true or false)");
      continueAsks = scanner.nextBoolean();
    }
  }
}
