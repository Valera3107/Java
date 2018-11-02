package RoomSystem.API;

import RoomSystem.API.API;
import RoomSystem.Room;

public class TripAdvisorAPI implements API {
  Room[] rooms = new Room[5];

  @Override
  public Room[] findRooms(int price, int persons, String city, String hotel) {
    for (int i = 0; i < rooms.length; i++) {
      if(rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel){
        System.out.println("room info: price " + rooms[i].getPrice() + " id " + rooms[i].getPrice() + " city " + rooms[i].getCityName() + " name " + rooms[i].getHotelName() + "person" +rooms[i].getPersons());
        return new Room[i];
      }
    }
    return null;
  }
}
