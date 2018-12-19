package module_2_14;


public class MyTestMethod {
  public static <T extends Comparable<T>> int calcNum(T[] arr, T maxElem){
    int count = 0;
    for (T t : arr
         ) {
     if(maxElem.compareTo(t) < 0) count++;
    }
    return count;
  }

  public static <T extends Number & Comparable<T>> Double calcSum(T[] arr, T maxElem) {
    Double sum = 0.0;
    for (T t : arr
      ) {
      if(maxElem.compareTo(t) < 0) sum += (Double.parseDouble(t.toString()));
    }
    return sum;
  }

}
