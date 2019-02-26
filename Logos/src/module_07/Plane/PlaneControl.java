package module_07.Plane;

import java.util.Random;

public class PlaneControl {
  public void up() {
    int distance = (int) (Math.random() * 500);
    System.out.println("Plane have fly up on " + distance + " m.");
  }

  public void down() {
    int distance = (int) (Math.random() * 500);
    System.out.println("Plane have fly down on " + distance + " m.");
  }

  public void right() {
    int distance = (int) (Math.random() * 500);
    System.out.println("Plane have right up on " + distance + " m.");
  }

  public void left() {
    int distance = (int) (Math.random() * 500);
    System.out.println("Plane have fly left on " + distance + " m.");
  }
}
