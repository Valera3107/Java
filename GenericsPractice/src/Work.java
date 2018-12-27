import java.util.ArrayList;

public class Work {
  private int salary;
  private String workName;
  private ArrayList<Person> listOfWorker = new ArrayList<>();

  public Work(int salary, String workName) {
    this.salary = salary;
    this.workName = workName;
  }

  public int getSalary() {
    return salary;
  }

  public String getWorkName() {
    return workName;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setWorkName(String workName) {
    this.workName = workName;
  }

  public ArrayList<Person> getListOfWorker() {
    return listOfWorker;
  }

  public void addToWork(Person<? super Man> person) {
    listOfWorker.add(person);
  }
}
