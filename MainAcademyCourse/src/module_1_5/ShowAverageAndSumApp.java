package module_1_5;

import java.util.Scanner;

public class ShowAverageAndSumApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input max number : ");
    int sum = 0;
    int middle = 0;
    int max = scanner.nextInt();
    for (int i = 0; i <= max; i++) {
      sum += i;
      if(i == max){
        middle =(int) sum / i;
      }
    }

    System.out.println("Summ of numbers: " + sum);
    System.out.println("Average of nembers: " + middle);
  }
}
