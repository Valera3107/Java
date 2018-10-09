package module_1_5;

import java.util.Scanner;

public class ShowTextOfNumberApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input number from 1 to 12: ");
    int num = scan.nextInt();

    switch (num) {
      case 1:
        System.out.println("One");break;
      case 2:
        System.out.println("Two");break;
      case 3:
        System.out.println("Three");break;
      case 4:
        System.out.println("Four");break;
      case 5:
        System.out.println("Five");break;
      case 6:
        System.out.println("six");break;
      default:
        System.out.println("Another number");break;
    }
  }
}
