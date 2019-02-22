package module_01;

import javax.swing.border.Border;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    //=================== 1
    int i = 23;
    byte b = 43;
    float f = 34.54f;
    double d = 345.65;
    char c = 'h';
    boolean bool = true;
    long l = 345346523;
    short s = 353;


    //========================== 2

    System.out.println("Max and Min value Integer " + Integer.MAX_VALUE + "  " + Integer.MIN_VALUE);
    System.out.println("Max and Min value Double: " + Double.MAX_VALUE + "  " + Double.MIN_VALUE);
    System.out.println("Max and Min value Float: " + Float.MAX_VALUE + "  " + Float.MIN_VALUE);
    System.out.println("Max and Min value Long: " + Long.MAX_VALUE + "  " + Long.MIN_VALUE);
    System.out.println("Max and Min value Byte: " + Byte.MAX_VALUE + "  " +Byte.MIN_VALUE);
    System.out.println("Max and Min value Short: " + Short.MAX_VALUE + "  " +Short.MIN_VALUE);
    System.out.println("Max and Min value Character: " + Character.MAX_VALUE + "  " +Character.MIN_VALUE);

    System.out.println("\n\n");




    //========================== 3

    int[] arr = new int[10];
    for (int j = 0; j < arr.length; j++) {
      arr[j] = 1 + (int) (Math.random()*99);
    }

    System.out.println("Max value of array: " + max(arr));
    System.out.println("Min value of array: " + min(arr));
  }

  private static int max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  private static int min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }
}
