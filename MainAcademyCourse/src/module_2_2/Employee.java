package module_2_2;

public class Employee {
  public static void calcSalary(String name, double ...arrOfSalary) {
    double totalSum = 0;
    for (double item:
         arrOfSalary) {
      totalSum+=item;
    }

    System.out.println(name + " has " + totalSum + "$");
  }
}
