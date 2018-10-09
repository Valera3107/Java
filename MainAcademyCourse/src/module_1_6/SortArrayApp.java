package module_1_6;

import java.util.Arrays;
import java.util.Random;

public class SortArrayApp {
  public static void main(String[] args) {
    int[] arrOfAverageTemp = new int[30];
    int max = 25;
    int min = -15;
    for (int i = 0; i < arrOfAverageTemp.length; i++) {
      arrOfAverageTemp[i] = min + (int) (Math.random() * max);
    }

    Arrays.sort(arrOfAverageTemp);

    System.out.println(Arrays.toString(arrOfAverageTemp));
  }
}
