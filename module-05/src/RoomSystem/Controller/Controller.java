package RoomSystem.Controller;

import RoomSystem.API.API;
import RoomSystem.API.BookingComAPI;
import RoomSystem.API.GoogleAPI;
import RoomSystem.API.TripAdvisorAPI;
import RoomSystem.Room;

import java.util.Date;

public class Controller {
  private API[] apis;

  public Controller() {
    apis = new API[3];
    apis[0] = new GoogleAPI();
    apis[1] = new BookingComAPI();
    apis[2] = new TripAdvisorAPI();
  }

  public Room[] requestRooms(int price, int persons, String city, String hotel) {
    Room[] rooms = new Room[10];
    int index = 0;
    for (API api : apis) {
      for (Room room : api.getRooms()) {
        if (room.equals(new Room(1, price, persons, new Date(), hotel, city))) {
          rooms[index] = room;
          index++;
        }
      }
    }
    Room[] foundRooms = new Room[index];
    index = 0;
    for (Room room : rooms) {
      if (room != null) {
        foundRooms[index] = room;
        index++;
      }
    }
    return foundRooms;
  }

  public Room[] check(API api1, API api2) {
    Room[] rooms = new Room[api1.getRooms().length + api2.getRooms().length];
    int index = 0;

    for (Room room1 : api1.getRooms()
      ) {
      for (Room room2 : api2.getRooms()) {
        if (room1.equals(room2)) {
          rooms[index] = room1;
          index++;
        }
      }
    }
    Room[] commonRooms = new Room[index];
    index = 0;
    for (Room room : rooms) {
      if (room != null) {
        commonRooms[index] = room;
        index++;
      }
    }
    return commonRooms;
  }
}
