package module_2_7.AdditionalModule;

public class Bus {
  private int seats;
  private Person driver;

  public Bus(int seats, Person driver) {
    this.seats = seats;
    this.driver = driver;
  }

  public Person getDriver() {
    return driver;
  }

  public void setDriver(Person driver) {
    this.driver = driver;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }
}
