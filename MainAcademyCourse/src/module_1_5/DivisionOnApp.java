package module_1_5;

import java.util.Scanner;

public class DivisionOnApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input two numbers which must division on: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println("num1 " + num1);

    System.out.println("num2 " + num2);

    for (int i = 1; i <= 300; i++) {
      if(num1%i == 0 || num2%i == 0){
        System.out.println(i);
      }
    }
  }
}
