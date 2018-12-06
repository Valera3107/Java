package module_2_4;

import module_2_3.MyWindow;

public class Calculation {
  public static void main(String[] args) {
    int[] arr = {21, 43, -4, 0, 54, 100, -45};

    double radius = 10;

    System.out.println("Radius - " + MyMath.areaOfCircle(radius));

    System.out.println("Max - " + MyMath.findMax(arr));
    System.out.println("Min - " + MyMath.findMin(arr));

    //===========

    Employee Vitia = new Employee("Vitia", "Eli", "Manager", 34343434);
    Employee Dima = new Employee("Dima", "Gaidai", "Security", 111111111);

    System.out.println("Number of employee - " + Employee.getNumberOfEmployee());

    //===========

    System.out.println(MyCalc.calcPI(10));

    //===========

    MyPyramid.printPyramid(9);

    //===========

    GravityCalculator obj = new GravityCalculator(10,1000);
    System.out.println("distance - " + obj.calcDist(20));
  }
}
