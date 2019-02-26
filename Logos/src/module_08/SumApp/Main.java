package module_08.SumApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    summingProcess();
  }

  private static void summingProcess(){
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Input num 1: ");
      int num1 = sc.nextInt();
      sc.nextLine();
      System.out.println("Input num 2: ");
      int num2 = sc.nextInt();
      System.out.println("Sum = " + (num1+num2));
    } catch (InputMismatchException e) {
      System.out.println("You have inputted not valid number!!!");
    }
  }
}
