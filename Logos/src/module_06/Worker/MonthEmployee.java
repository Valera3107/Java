package module_06.Worker;

public class MonthEmployee implements Salary {
  private static final int MONTH_SALARY = 1560;
  private int months;
  private String name;

  public MonthEmployee(int months, String name) {
    this.months = months;
    this.name = name;
  }

  public static int getMonthSalary() {
    return MONTH_SALARY;
  }

  public int getMonths() {
    return months;
  }

  public void setMonths(int months) {
    this.months = months;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void salary() {
    int totalSum = months * MONTH_SALARY;
    System.out.println("Salary for " + getMonths() + " months is " + totalSum);
  }
}
