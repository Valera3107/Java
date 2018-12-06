package module_2_8.additional_practice;

public class BusPlace {
  private int placeNumber;
  private Sportsman place;

  public BusPlace(int placeNumber) {
    this.placeNumber = placeNumber;
  }

  public Sportsman getPlace() {
    return place;
  }

  public void setPlace(Sportsman place) {
    this.place = place;
  }
}
