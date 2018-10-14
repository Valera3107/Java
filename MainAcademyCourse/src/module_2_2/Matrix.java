package module_2_2;

public class Matrix {
  public static int[][] addMatrix(int[][] arrFirst, int[][] arrSecond) {
    int[][] additionalArr = new int[arrFirst.length][arrFirst.length];

    for (int i = 0; i < arrFirst.length; i++) {
      for (int j = 0; j < arrSecond.length; j++) {
        additionalArr[i][j] = arrFirst[i][j] + arrSecond[i][j];
      }
    }

    return additionalArr;
  }

  public static int multMatrix(int[][] arrFirst, int[][] arrSecond) {
    int[][] additionalArr = addMatrix(arrFirst, arrSecond);
    return additionalArr[0][0] + additionalArr[1][1] - additionalArr[0][1] - additionalArr[1][0];
  }

}
