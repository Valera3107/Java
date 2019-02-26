package module_07.Plane;

public class Su_27 extends Plane implements PlaneInterface {
  private double maxSpeed;
  private String color;
  private PlaneControl control = new PlaneControl();

  public Su_27(double maxSpeed, String color, double length, double width, double weight) {
    super(length, width, weight);
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  public Su_27(double maxSpeed, String color, PlaneControl control) {
    this.maxSpeed = maxSpeed;
    this.color = color;
    this.control = control;
  }

  public Su_27(double maxSpeed, String color) {
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  public PlaneControl getControl() {
    return control;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void flyUp(){
    getControl().up();
  }

  public void flyDown(){
    getControl().down();
  }

  public void flyRight(){
    getControl().right();
  }

  public void flyLeft(){
    getControl().left();
  }

  @Override
  public void turboAcceleration() {
    double turbo = (getMaxSpeed() + 1) + Math.random() * 1000;
    System.out.println("Turbo speed is " + turbo + " km/h.");
  }

  @Override
  public void stealthTechnology() {
    int time = 1 + (int) (Math.random() * 10_000);
    System.out.println("Plane not will be visible for " + time + " seconds.");
  }

  @Override
  public void nuclearStrike() {
    int bombAmount = 1 + (int) (Math.random() * 10);
    System.out.println("Bomb have been throwing down during fighting - " + bombAmount);
  }
}
