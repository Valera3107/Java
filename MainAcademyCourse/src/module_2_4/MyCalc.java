package module_2_4;

public class MyCalc {
  public static double calcPI(int n) {
    double res = 0;
    boolean prev = true;

    for (int i = 1; i <= n; i++) {
      if(i%2 != 0 && prev) {
        res +=(double) 4/i;
        prev = false;
      } else if(i%2 != 0 && !prev) {
        prev = true;
        res -=(double) 4/i;
      }
    }

    return res;
  }
}
