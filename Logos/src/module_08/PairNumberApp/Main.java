package module_08.PairNumberApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    pairNumber();
  }

  private static void pairNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number");
    try {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        System.out.println("Number is pair.");
      } else {
        System.out.println("Number is not pair.");
      }
    } catch (InputMismatchException e) {
      System.out.println("You have inputted not integer number!!!!");
    }
  }
}
