package Utils;

public class ArraysUtils {

  public static int[] reverse(int[] array) {
    int temp;
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

    return array;
  }

  public static double[] reverse(double[] array) {
    double temp;
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

    return array;
  }

  public static int[] findEvenElements(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i]%2 != 0) {
        count++;
      }
    }

    int[] evenArr = new int[count];
    for (int i = array.length-1; i > 0; i--) {
      if(array[i]%2 != 0) {
        evenArr[count] = array[i];
        count--;
      }
    }

    return evenArr;
  }

  public static double[] findEvenElements(double[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i]%2 != 0) {
        count++;
      }
    }

    double[] evenArr = new double[count];
    for (int i = array.length-1; i > 0; i--) {
      if(array[i]%2 != 0) {
        evenArr[count] = array[i];
        count--;
      }
    }

    return evenArr;
  }

  public static int[] modules(int[] arrOfInt) {
    for (int i = 0; i < arrOfInt.length; i++) {
      if(arrOfInt[i] < 0) {
        arrOfInt[i] = arrOfInt[i] * (-1);
      }
    }
    return arrOfInt;
  }

  public static double[] modules(double[] arrOfDouble) {
    for (int i = 0; i < arrOfDouble.length; i++) {
      if(arrOfDouble[i] < 0) {
        arrOfDouble[i] = arrOfDouble[i] * (-1);
      }
    }
    return arrOfDouble;
  }

  public static int secondLargest(int[] arrOfInt) {
    int max = 0;
    for (int i = 0; i < arrOfInt.length; i++) {
      if(max < arrOfInt[i]){
        max = arrOfInt[i];
        break;
      }
    }

    int secondMax = 0;
    for (int i = 0; i < arrOfInt.length; i++) {
      if(secondMax < arrOfInt[i] && secondMax < max){
        secondMax = arrOfInt[i];
        break;
      }
    }

    return secondMax;
  }

  public static double secondLargest(double[] arrOfDouble) {
    double max = 0;
    for (int i = 0; i < arrOfDouble.length; i++) {
      if(max < arrOfDouble[i]){
        max = arrOfDouble[i];
        break;
      }
    }

    double secondMax = 0;
    for (int i = 0; i < arrOfDouble.length; i++) {
      if(secondMax < arrOfDouble[i] && secondMax < max){
        secondMax = arrOfDouble[i];
        break;
      }
    }

    return secondMax;
  }

  public static int multiplication(int[] arrOfInt){
    int mult = 1;
    for (int i = 0; i < arrOfInt.length; i++) {
      mult*=arrOfInt[i];
    }
    return mult;
  }

  public static double multiplication(double[] arrOfDouble){
    double mult = 1;
    for (int i = 0; i < arrOfDouble.length; i++) {
      mult*=arrOfDouble[i];
    }
    return mult;
  }


  public static int max(int[] arrOfInt){
    int max = 0;
    for (int i = 0; i < arrOfInt.length; i++) {
      if(max < arrOfInt[i]) {
        max = arrOfInt[i];
        break;
      }
    }
    return max;
  }

  public static double max(double[] arrOfDouble){
    double max = 0;
    for (int i = 0; i < arrOfDouble.length; i++) {
      if(max < arrOfDouble[i]) {
        max = arrOfDouble[i];
        break;
      }
    }
    return max;
  }

  public static int min(int[] arrOfInt){
    int min = 0;
    for (int i = 0; i < arrOfInt.length; i++) {
      if(min > arrOfInt[i]) {
        min = arrOfInt[i];
        break;
      }
    }
    return min;
  }

  public static double min(double[] arrOfDouble){
    double min = 0;
    for (int i = 0; i < arrOfDouble.length; i++) {
      if(min > arrOfDouble[i]) {
        min = arrOfDouble[i];
        break;
      }
    }
    return min;
  }


  public static int sum(int[] arrOfInt){
    int total = 0;
    for (int i = 0; i < arrOfInt.length; i++) {
      total+=arrOfInt[i];
    }

    return total;
  }

  public static double sum(double[] arrOfDouble){
    double total = 0;
    for (int i = 0; i < arrOfDouble.length; i++) {
      total+=arrOfDouble[i];
    }

    return total;
  }
}
