package DAO.DAOs;

import Model.Room;

import java.util.List;

public interface RoomDAO<T extends Room> {
  List<T> getAllRooms();

  T getRoomById();

  List<T> getRoomsByCity();

  boolean deleteRoomById();

  boolean createNewRoom();

  List<T> getFreeRooms();

  boolean updateRoom();

  void addUser();

  void releaseRoom();
}

