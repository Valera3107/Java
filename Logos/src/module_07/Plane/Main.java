package module_07.Plane;

public class Main {
  public static void main(String[] args) {
    Su_27 su_27 = new Su_27(1500.54, "Blue", 400,240,6000);
    su_27.engineStarting();
    su_27.landingPlane();
    su_27.flyUp();
    su_27.flyLeft();
    su_27.flyDown();
    su_27.flyRight();
    su_27.stealthTechnology();
    su_27.nuclearStrike();
    su_27.turboAcceleration();
    su_27.planeFudge();
  }
}
