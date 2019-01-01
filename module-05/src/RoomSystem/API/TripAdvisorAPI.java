package RoomSystem.API;

import RoomSystem.Room;

import java.util.Date;

public class TripAdvisorAPI implements API {
  private Room[] rooms;

  public TripAdvisorAPI() {
    rooms = new Room[5];
    rooms[0] = new Room(22, 1050, 2, new Date(), "HotelCalifornia", "Kiev");
    rooms[1] = new Room(43, 3400, 10, new Date(), "WhiteTree", "Rostov");
    rooms[2] = new Room(65, 750, 1, new Date(), "Will", "Dnepr");
    rooms[3] = new Room(87, 2500, 4, new Date(), "PalmaPalace", "Miami");
    rooms[4] = new Room(94, 1050, 3, new Date(), "HotelCalifornia", "Kiev");
  }

  @Override
  public Room[] getRooms() {
    return rooms;
  }

  @Override
  public Room[] findRooms(int price, int persons, String city, String hotel) {
    Room[] foundRooms = new Room[rooms.length];
    int index = 0;
    for (int i = 0; i < rooms.length; i++) {
      if(rooms[i].equals(new Room(34, price, 1, new Date(), hotel, city))){
        foundRooms[index] = rooms[i];
        index++;
      }
    }

    Room[] result = new Room[index];
    index = 0;
    for (int i = 0; i < foundRooms.length; i++) {
      if(foundRooms[i] != null) {
        result[index] = foundRooms[i];
        index++;
      }
    }

    return result;
  }
}
