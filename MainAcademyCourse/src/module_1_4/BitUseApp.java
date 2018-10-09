package module_1_4;

import java.util.Arrays;

public class BitUseApp {
  public static void main(String[] args) {
    int a = 10;
    System.out.println("a<<1 " +(a<<1));
    a = 10;
    System.out.println("a>>1 " +(a>>1));
    a = 10;
    System.out.println("a|1 " + (a|1));
    a = 10;
    System.out.println("a&1 " +(a&1));
    a = 10;
    System.out.println("~a " +(~a));

    int[] arr = new int[4];
    Arrays.fill(arr, 1);
    System.out.println(Arrays.toString(arr));
   }
}
