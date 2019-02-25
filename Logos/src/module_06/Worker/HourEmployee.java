package module_06.Worker;

public class HourEmployee implements Salary {
  private static final int HOUR_SALARY = 11;
  private String name;
  private int hours;

  public HourEmployee(String name, int hours) {
    this.name = name;
    this.hours = hours;
  }

  public static int getHourSalary() {
    return HOUR_SALARY;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  @Override
  public void salary() {
    int totalSum = hours * HOUR_SALARY;
    System.out.println("Salary for " + getHours() + " hours is " + totalSum);
  }
}
