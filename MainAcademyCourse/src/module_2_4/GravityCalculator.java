package module_2_4;

public class GravityCalculator {
  private static final double acceleration = 9.81;
  private double vi;
  private double xi;

  public GravityCalculator(double vi, double xi) {
    this.vi = vi;
    this.xi = xi;
  }

  public double calcDist(double time) {
   double distance = 0.5*Math.pow(time,2)*acceleration + time*this.vi + this.xi;
   return distance;
  }
}
