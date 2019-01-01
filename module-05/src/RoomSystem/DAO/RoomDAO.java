package RoomSystem.DAO;

import RoomSystem.Room;

import java.util.Date;

public class RoomDAO implements DAO{
  Room[] roomsDB = new Room[10];

  public Room save(Room room) {
    int freeIndex = getRoomsCount();
    if (freeIndex == roomsDB.length) return null;
    roomsDB[freeIndex] = room;
    return room;
  }

  public int getRoomsCount() {
    int count = 0;
    for (Room r : roomsDB) {
      if (r != null) {
        count++;
      }
    }
    return count;
  }

  public boolean delete(Room room) {
    for (int i = 0; i < roomsDB.length; i++) {
      Room roomInDb = roomsDB[i];
      if (room.equals(roomInDb)) {
        System.arraycopy(roomsDB, i + 1, roomsDB, i, roomsDB.length - i - 1);
        roomsDB[roomsDB.length - 1] = null;
        return true;
      }
    }
    return false;
  }

  public Room update(Room room) {
    for (Room r : roomsDB) {
      if (r.equals(room)) {
        System.out.println("room info BEFORE: price " + r);
        r = new Room(1111, 1340, 5, new Date(2020, 8, 28), "FuckinHotelHateYou", "Taganrog");
        System.out.println("room info AFTER: price " + r);
        return r;
      }
    }
    System.out.println("Nothing fond!");
    return null;
  }

  public Room findById(long id) {
    for (Room room : roomsDB) {
      if (room.getId() == id) {
        System.out.println("room info: price " + room);
        return room;
      }
    }
    System.out.println("No room with this id!");
    return null;
  }
}
