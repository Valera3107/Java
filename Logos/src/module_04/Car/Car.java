package module_04.Car;

public class Car {
  private Body body;
  private Wheel wheel;
  private Rudder rudder;

  public Car(Body body, Wheel wheel, Rudder rudder) {
    this.body = body;
    this.wheel = wheel;
    this.rudder = rudder;
  }

  public Body getBody() {
    return body;
  }

  public void setBody(Body body) {
    this.body = body;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public Rudder getRudder() {
    return rudder;
  }

  public void setRudder(Rudder rudder) {
    this.rudder = rudder;
  }

  @Override
  public String toString() {
    return "Car{" +
      "body=" + body +
      ", wheel=" + wheel +
      ", rudder=" + rudder +
      '}';
  }
}
