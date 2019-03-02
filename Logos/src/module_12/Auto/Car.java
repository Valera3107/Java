package module_12.Auto;

public class Car implements Comparable {
  private int createdAt;
  private int horsePower;
  private Engine engine;
  private Wheel wheel;

  public Car(int createdAt, int horsePower, Engine engine, Wheel wheel) {
    this.createdAt = createdAt;
    this.horsePower = horsePower;
    this.engine = engine;
    this.wheel = wheel;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public Car(int createdAt, int horsePower) {
    this.createdAt = createdAt;
    this.horsePower = horsePower;
  }

  public int getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(int createdAt) {
    this.createdAt = createdAt;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  @Override
  public int compareTo(Object o) {
    Car car = (Car) o;
    if (this.horsePower != car.getHorsePower()) return this.horsePower - car.getHorsePower();
    else if(this.getEngine().getNumberOfCylinders() != car.getEngine().getNumberOfCylinders()){
      return this.getEngine().getNumberOfCylinders() - car.getEngine().getNumberOfCylinders();
    } else {
      return this.getWheel().getDiameter() - car.getWheel().getDiameter();
    }
  }

  @Override
  public String toString() {
    return "Car{" +
      "createdAt=" + createdAt +
      ", horsePower=" + horsePower +
      ", engine=" + engine +
      ", wheel=" + wheel +
      "}\n";
  }
}
