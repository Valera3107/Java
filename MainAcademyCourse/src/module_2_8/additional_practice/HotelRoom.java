package module_2_8.additional_practice;

public class HotelRoom {
  private int roomNumber;
  private Sportsman place;


  public HotelRoom(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Sportsman getPlace() {
    return place;
  }

  public void setPlace(Sportsman place) {
    this.place = place;
  }
}
