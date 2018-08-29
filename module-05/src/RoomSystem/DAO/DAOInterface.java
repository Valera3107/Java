package RoomSystem.DAO;

import RoomSystem.Room;

import java.sql.SQLOutput;
import java.util.Date;

public class DAOInterface implements DAO{
  Room[] rooms = new Room[5];

  public Room save(Room room){
    for (int i = 0; i < rooms.length; i++) {
      if(rooms[i] == null) {
        rooms[i] = room;
        return room;
      }
    }
    return null;
  }

  public boolean delete(Room room){
    for (int i = 0; i < rooms.length; i++) {
      Room roomInDb = rooms[i];

      if (room.equals(roomInDb)) {

        System.arraycopy(rooms, i + 1, rooms, i, rooms.length - i - 1);

        rooms[rooms.length - 1] = null;
        return true;
      }

    }
    return false;
  }

  public Room update(Room room){
    for (Room room1 : rooms) {
      if(room1.equals(room)){
        System.out.println("room info BEFORE: price " + room1.getPrice() + " id " + room1.getPrice() + " city " + room1.getCityName() + " name " + room1.getHotelName());
        room1 = new Room(1111, 1340, 5, new Date(2020, 8, 28), "FuckinHotelHateYou", "Taganrog");;
        System.out.println("room info AFTER: price " + room1.getPrice() + " id " + room1.getPrice() + " city " + room1.getCityName() + " name " + room1.getHotelName());
        return room1;
      }
    }
    System.out.println("Nothing finded");
    return null;
  }

  public Room findById(long id){
    for (Room room : rooms) {
      if(room.getId() == id){
        System.out.println("room info: price " + room.getPrice() + " id " + room.getPrice() + " city " + room.getCityName() + " name " + room.getHotelName());
        return room;
      }
    }
    return null;
  }
}
