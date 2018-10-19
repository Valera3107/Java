package module_2_5;

import java.util.Random;

public class MyInit {
  private static int[] arr = new int[10];

  static{
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1 + (int) (Math.random()*100);
    }
  }

  public void printArray(){
    for (int elem: arr) {
      if(elem == arr[arr.length-1]){
        System.out.println(elem + ";");
      } else {
        System.out.print(elem + ", ");
      }
    }
    System.out.println();
  }
}
