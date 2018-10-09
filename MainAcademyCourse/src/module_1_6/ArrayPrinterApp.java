package module_1_6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrinterApp {
  public static void main(String[] args) {
    int[][] arr = new int[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = -15 + (int)(Math.random()*25);
      }
    }

    for (int i = 0; i < 4; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }


  }
}
