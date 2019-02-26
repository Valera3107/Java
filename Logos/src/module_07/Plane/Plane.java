package module_07.Plane;

public abstract class Plane {
  private double length;
  private double width;
  private double weight;

  public Plane(double length, double width, double weight) {
    super();
    this.length = length;
    this.width = width;
    this.weight = weight;
  }

  public Plane() {
    super();
    this.length = length;
    this.width = width;
    this.weight = weight;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void engineStarting() {
    int time = 20 + (int) (Math.random() * 88);
    System.out.println("Plane will can fly after " + time + " seconds.");
  }

  public void landingPlane() {
    double distance = Math.random()*1000;
    System.out.println("Plane can fly " + distance + " km.");
  }

  public void planeFudge() {
    System.out.println("Plane is landing.");
  }

}
