package module_1_6;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumInArrayApp {
  public static void main(String[] args) {
    int n = 4, m = 5;
    int[][] arr = new int[n][m];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = 1 + (int)(Math.random()*9);
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }

    System.out.println("Input array number : ");
    int num = scanner.nextInt();
    int[] lineArr = new int[n];
    int[] indexArr = new int[m];
    int prevInd, nextInd;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if(num == arr[i][j]){
          indexArr[j] = 1;
        }
      }
      System.out.println(Arrays.toString(indexArr));
      for (int j = 0; j < m; j++) {
        if(indexArr[j] == 1){
          System.out.println("Line " + ( i + 1 ) + " : " + "[" + j + "]");
        }
      }

      Arrays.fill(indexArr, 0);
    }

  }
}
