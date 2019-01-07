package DAO.DAOs;

import Model.Hotel;
import Model.Room;

import java.util.List;

public interface HotelDAO<T extends Hotel> {
  List<T> getAllHotels();

  T getHotelById();

  List<T> getHotelsByCity();

  boolean deleteHotelById();

  T createNewHotel();

  List<Room> getRoomsAtHotel();

  boolean updateHotel();

  void setRoomToTheHotel();

  void deleteRoomFromHotel();
}
