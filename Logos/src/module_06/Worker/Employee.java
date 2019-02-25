package module_06.Worker;

public class Employee implements Salary {
  private static final int MONTH_SALARY = 2650;
  private static final int HOUR_SALARY = 12;
  private Time time;
  private String name;
  private int count;

  public Employee(Time time, String name, int count) {
    this.time = time;
    this.name = name;
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public static int getMonthSalary() {
    return MONTH_SALARY;
  }

  public static int getHourSalary() {
    return HOUR_SALARY;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void salary() {
    int totalSum;
    if (time == Time.MONTH) {
      totalSum = MONTH_SALARY * getCount();
    } else {
      totalSum = HOUR_SALARY * getCount();
    }
    System.out.println("Your salary for " + getCount() + " " + getTime() + " is " + totalSum);
  }
}
