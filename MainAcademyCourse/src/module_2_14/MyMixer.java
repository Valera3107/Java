package module_2_14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MyMixer<T> {
  private T[] arr;

  public MyMixer(T[] arr) {
    this.arr = arr;
  }

  public T[] getArr() {
    return arr;
  }

  public void setArr(T[] arr) {
    this.arr = arr;
  }

  public T[] shuffle() {
    Random rand = ThreadLocalRandom.current();
    for (int i = arr.length - 1; i > 0; i--) {
      int index = rand.nextInt(i + 1);
      T a = arr[index];
      arr[index] = arr[i];
      arr[i] = a;
    }
    return arr;
  }
}
