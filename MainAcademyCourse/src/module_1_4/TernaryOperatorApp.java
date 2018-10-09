package module_1_4;

public class TernaryOperatorApp {
  public static void main(String[] args) {
    int a = 10;
    int b = 34;
    int res = a > b ? a : (a==b ? a + b : (a < b ? b : ~b));
    System.out.println("Resault of ternar operation a > b ? a : (a==b ? a + b : (a < b ? b : ~b)) - " + res);
  }
}
