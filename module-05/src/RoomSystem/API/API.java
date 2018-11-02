package RoomSystem.API;

import RoomSystem.Room;

public interface API {
  Room[] findRooms(int price, int persons, String city, String hotel);
}
