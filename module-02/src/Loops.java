public class Loops {
  public static void main(String[] args) {
    int max = 20, min = -10;

    int sumOfInt = 0;
    float sumOfFloat = 0;

    int multOfInt = 0;
    float multOfFloat = 0;

    int maxOfInt = 0;
    float maxOfFloat = 0;

    int minOfInt = 0;
    float minOfFloat = 0;

    int secondLargestNumOfInt = 0;
    int secondLargestNumOfFloat = 0;

    int[] arrOfIntegersNumbers = new int[10];

    float[] arrOfFloatNumbers = new float[10];


    for (int i = 0; i < arrOfFloatNumbers.length; i++) {
      float randomFloatNumber = min + (float) (Math.random() * max);
      int randomIntegerNumber = min + (int) (Math.random() * max);
      arrOfFloatNumbers[i] = randomFloatNumber;
      arrOfIntegersNumbers[i] = randomIntegerNumber;
    }


    for (int i = 0; i < arrOfIntegersNumbers.length; i++) {
      sumOfFloat += arrOfFloatNumbers[i];
      sumOfInt += arrOfIntegersNumbers[i];

      multOfFloat *= arrOfFloatNumbers[i];
      multOfInt *= arrOfIntegersNumbers[i];

      if(maxOfFloat < arrOfFloatNumbers[i]){
         maxOfFloat = arrOfFloatNumbers[i];
      }

      if(maxOfInt < arrOfIntegersNumbers[i]){
        maxOfInt = arrOfIntegersNumbers[i];
      }

      if(minOfFloat > arrOfFloatNumbers[i]){
        minOfFloat = arrOfFloatNumbers[i];
      }

      if(minOfInt > arrOfIntegersNumbers[i]){
        minOfInt = arrOfIntegersNumbers[i];
      }
    }

    for (int i = 0; i < arrOfIntegersNumbers.length; i++) {
      if(minOfInt < arrOfIntegersNumbers[i]) {
        secondLargestNumOfInt = arrOfIntegersNumbers[i];
      }
    }

//    for (int i = 0; i < arrOfFloatNumbers.length; i++) {
//      if(minOfFloat < arrOfFloatNumbers[i]) {
//        secondLargestNumOfFloat = arrOfFloatNumbers[i];
//      }
//    }
    System.out.print("arr f :");
    for (int i = 0; i < arrOfFloatNumbers.length; i++) {
      System.out.print(arrOfFloatNumbers[i] + " ");
    }

    System.out.println("----------------");

    System.out.print("arr i :");
    for (int i = 0; i < arrOfFloatNumbers.length; i++) {
      System.out.print(arrOfIntegersNumbers[i] + " ");
    }
    System.out.println();

    System.out.println("max f " + maxOfFloat);
    System.out.println("min f " + minOfFloat);
    System.out.println("min i " + minOfInt);
    System.out.println("max i " + maxOfInt);

    System.out.println("mult f " + multOfFloat);
    System.out.println("mult i " + multOfInt);
    System.out.println("sum f " + sumOfFloat);
    System.out.println("sum i " + sumOfInt);

  }
}
