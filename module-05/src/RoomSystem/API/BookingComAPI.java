package RoomSystem.API;

import RoomSystem.API.API;
import RoomSystem.Room;

public class BookingComAPI implements API {

  @Override
  public Room[] findRooms(int price, int persons, String city, String hotel) {

    return new Room[0];
  }
}
