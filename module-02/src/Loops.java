import java.lang.reflect.Array;
import java.util.Arrays;

public class Loops {
  public static void main(String[] args) {
    int max = 20, min = -10;

    int[] arrOfIntegersNumbers = new int[10];

    double[] arrOfDoubleNumbers = new double[10];

    for (int i = 0; i < arrOfDoubleNumbers.length; i++) {
      float randomFloatNumber = min + (float) (Math.random() * max);
      int randomIntegerNumber = min + (int) (Math.random() * max);
      arrOfDoubleNumbers[i] = randomFloatNumber;
      arrOfIntegersNumbers[i] = randomIntegerNumber;
    }

    System.out.println(Arrays.toString(arrOfIntegersNumbers));
    System.out.println(Arrays.toString(arrOfDoubleNumbers));


    int sumOfInt = sum(arrOfIntegersNumbers);
    double sumOfDouble = sum(arrOfDoubleNumbers);

    System.out.println("SumOfInt " + sumOfInt);
    System.out.println("SumOfDouble " + sumOfDouble);

    int multOfInt = multiplication(arrOfIntegersNumbers);
    double multOfDouble = multiplication(arrOfDoubleNumbers);

    System.out.println("MultOfInt " + multOfInt);
    System.out.println("MultOfDouble " + multOfDouble);

    int maxOfInt = max(arrOfIntegersNumbers);
    double maxOfDouble = max(arrOfDoubleNumbers);

    System.out.println("MaxOfInt " + maxOfInt);
    System.out.println("MaxOfDouble " + maxOfDouble);

    int minOfInt = min(arrOfIntegersNumbers);
    double minOfDouble = min(arrOfDoubleNumbers);

    System.out.println("MinOfInt " + minOfInt);
    System.out.println("MinOfDouble " + minOfDouble);

    int secondLargestNumOfInt = secondLargest(arrOfIntegersNumbers);
    double secondLargestNumOfDouble = secondLargest((arrOfDoubleNumbers));

    System.out.println("SLOfInt " + secondLargestNumOfInt);
    System.out.println("SLOfDouble " + secondLargestNumOfDouble);
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
