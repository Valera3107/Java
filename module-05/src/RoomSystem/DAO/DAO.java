package RoomSystem.DAO;

import RoomSystem.Room;

public interface DAO {
  Room[] rooms = new Room[5];


  public Room save(Room room);
  public boolean delete(Room room);
  public Room update(Room room);
  public Room findById(long id);
}
