package module_2_17;

import java.util.Arrays;

public class SumCount extends Thread {
  private int[] arr;
  private long result;

  public SumCount(int[] arr) {
    this.arr = arr;
  }

  public long getResult() {
    return result;
  }

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  private void fillArray() {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random()*1000);
    }
    //System.out.println(Arrays.toString(arr));
  }

  private long calcSum() {
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  @Override
  public void run() {
    fillArray();
    System.out.println("Sum: " + calcSum());
  }
}
