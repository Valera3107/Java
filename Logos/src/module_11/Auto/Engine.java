package module_11.Auto;

public class Engine {
  private int numberOfCylinders;

  public Engine(int numberOfCylinders) {
    this.numberOfCylinders = numberOfCylinders;
  }

  public int getNumberOfCylinders() {
    return numberOfCylinders;
  }

  public void setNumberOfCylinders(int numberOfCylinders) {
    this.numberOfCylinders = numberOfCylinders;
  }

  @Override
  public String toString() {
    return
      "numberOfCylinders=" + numberOfCylinders;
  }
}
