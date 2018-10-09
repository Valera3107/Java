package module_1_6;

public class CreateArrayApp {
  public static void main(String[] args) {
    int[] arr = new int[29];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 2;
    }

    for (int elem: arr) {
      System.out.print(elem + " ");
    }
  }
}
