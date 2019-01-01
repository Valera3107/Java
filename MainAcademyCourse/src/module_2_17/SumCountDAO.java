package module_2_17;

public class SumCountDAO implements Runnable{
  private int[] arr;
  private long result;

  public SumCountDAO(int[] arr) {
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
