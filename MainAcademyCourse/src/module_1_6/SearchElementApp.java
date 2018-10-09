package module_1_6;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementApp {
  public static void main(String[] args) {
    int[] arr = {23, 45, 76, 87, 233, 1, 98, 55, 3, 100, 54};
    Arrays.sort(arr);

    System.out.println("Choose number to find element: ");
    for (int i:
         arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    int chooseNumber = scanner.nextInt();
    System.out.println();
    System.out.println("Binary finder: " + Arrays.binarySearch(arr, chooseNumber));
  }
}
