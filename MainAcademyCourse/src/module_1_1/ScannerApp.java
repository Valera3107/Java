package module_1_1;

import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {

    System.out.print("Enter the name of the student: ");

    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
    System.out.println();

    System.out.println("Hello, " + name);
  }
}
