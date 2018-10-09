package module_1_5;

import java.util.Scanner;

public class PyramidBuilderApp {
  public static void main(String[] args) {
    System.out.println("kkkk");
    Scanner scan = new Scanner(System.in);
    System.out.print("Input height of pyramid : ");
    int height = scan.nextInt();
    System.out.println();
    for (int i = 1; i <= height ; i++) {
      for( int j = 1; j <= i; j++) {
        if(j<=i) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }
}
