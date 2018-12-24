package Utils;

public class User {
  private long id;
  private String firstName;
  private String lastName;
  private int salary;
  private int balance;

  public User(long id, String firstName, String lastName, int salary, int balance) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.balance = balance;
  }

  public long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getSalary() {
    return salary;
  }

  public int getBalance() {
    return balance;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
