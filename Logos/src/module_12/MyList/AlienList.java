package module_12.MyList;

import java.util.Arrays;

public class AlienList<T> {
  private int arrSize = 8;
  private int counter = 0;
  private T[] arr = (T[]) new Object[arrSize];


  public void add(T item) {
    if (counter < arr.length) {
      arr[counter] = item;
      counter++;
    } else {
      arrSize += 8;
      T[] extendedArr = (T[]) new Object[arrSize];
      System.arraycopy(arr, 0, extendedArr, 0, arr.length);
      arr = extendedArr;
      arr[counter] = item;
      counter++;
    }
  }

  public void remove(int index) {
    arr[index] = null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < counter; i++) {
      if (arr[i] != null)
        sb.append(arr[i]).append(" ");
    }
    return sb.toString();
  }



}
