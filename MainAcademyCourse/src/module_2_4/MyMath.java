package module_2_4;

public class MyMath {
  public static final double PI = 3.14;

  public static double areaOfCircle(double radius) {
    return Math.pow(radius, 2)*PI*0.5;
  }

  public static int findMin(int ...arr) {
    int min = arr[0];
    for (int elem:
         arr) {
      if(min > elem){
        min = elem;
      }
    }

    return min;
  }

  public static int findMax(int ...arr) {
    int max = arr[0];
    for (int elem:
      arr) {
      if(max < elem){
        max = elem;
      }
    }

    return max;
  }
}
