package module_1_5;

import java.util.Scanner;

public class ShowSumOfNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of num: ");
    int numberOfNum = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < numberOfNum; i++) {
      int scanNum;
      if(i == numberOfNum-1){
        System.out.println("Input the last number: ");
        scanNum = scanner.nextInt();
      } else {
        System.out.println("Input number: ");
        scanNum = scanner.nextInt();
      }
      sum+=scanNum;
    }

    System.out.println("Summ of input number: " + sum);
  }
}
