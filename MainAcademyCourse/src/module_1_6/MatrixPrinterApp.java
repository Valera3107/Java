package module_1_6;

public class MatrixPrinterApp {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    int n = 1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = n++;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
