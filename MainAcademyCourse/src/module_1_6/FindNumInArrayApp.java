package module_1_6;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumInArrayApp {
  public static void main(String[] args) {
    int[][] arr = new int[4][5];
    Scanner scanner = new Scanner(System.in);

    int max = 20, min = 1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = 1 + (int)(Math.random()*25);
      }
    }

    for (int i = 0; i < 4; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }

    System.out.println("Input array number : ");
    int num = scanner.nextInt();

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        if(num == arr[i][j]){
          System.out.println("Line " + ( i + 1 ) + " : " + "[" + j + "]");
        }
      }
    }
  }
}
