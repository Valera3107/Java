package module_2_2;

public class Accountant {
  private double[] salary;
  private String name;

  public Accountant(String name, double... salary) {
    this.name = name;
    this.salary = salary;
  }

  public void showInfoAboutEmployee(){
    Employee.calcSalary(this.name, this.salary);
  }

}
