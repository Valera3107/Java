package DAO.Implementations;

import Controller.HotelMenu;
import DAO.DAOs.HotelDAO;
import Exceptions.InvalidInput;
import Model.Hotel;
import Model.Room;
import Service.DataBase;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Service.Colors.RED;

public class HotelWork implements HotelDAO {
  DataBase db = new DataBase();
  Scanner scanner = new Scanner(System.in);

  @Override
  public List getAllHotels() {
    return db.getHotels(HotelMenu.HOTEL_PATH);
  }

  @Override
  public Hotel getHotelById() {
    System.out.println(RED + "Input id: ");
    int id = scanner.nextInt();
    Hotel hotel = db.getHotels(HotelMenu.HOTEL_PATH).stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0);
    if (hotel == null) throw new InvalidInput();
    return hotel;
  }

  @Override
  public List getHotelsByCity() {
    System.out.println(RED + "Input city:");
    String city = scanner.next();
    return db.getHotels(HotelMenu.HOTEL_PATH).stream().filter(e -> e.getCity() == city).collect(Collectors.toList());
  }

  @Override
  public boolean deleteHotelById() {
    List<Hotel> hotels = getAllHotels();
    if (hotels.remove(getHotelById())) {
      db.writeHotel(hotels, HotelMenu.HOTEL_PATH);
      System.out.println(RED + "Hotel was successfully deleted from DB.");
      return true;
    }
    return false;
  }

  @Override
  public Hotel createNewHotel() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(RED + "Input name of the new Hotel:");
    String name = scanner.next();
    System.out.println(RED + "Input city:");
    String city = scanner.next();
    int size = scanner.nextInt();
    Hotel hotel = new Hotel(name, city, size);
    List<Hotel> hotels = getAllHotels();
    if (hotels.add(hotel)) {
      db.writeHotel(hotels, HotelMenu.HOTEL_PATH);
      System.out.println(RED + "Hotel was successfully added to the DB.");
    }
    return hotel;
  }

  @Override
  public List<Room> getRoomsAtHotel() {
    System.out.println(RED + "Input id: ");
    int id = scanner.nextInt();
    return db.readHotels(HotelMenu.HOTEL_PATH).stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0).getRoomList();
  }

  @Override
  public boolean updateHotel() {
    Hotel hotel = getHotelById();
    String name, city;
    int size;
    System.out.println(RED + "Input new name, city and size of the hotel");
    name = scanner.nextLine();
    city = scanner.nextLine();
    size = scanner.nextInt();
    hotel.setCity(city);
    hotel.setName(name);
    hotel.setSizeOfHotel(size);
    List<Hotel> hotels = db.readHotels(HotelMenu.HOTEL_PATH);
    if (hotels.remove(hotels.stream().filter(e -> e.getId() == hotel.getId()).collect(Collectors.toList()).get(0))
      ) {
      hotels.add(hotel);
      db.writeHotel(hotels, HotelMenu.HOTEL_PATH);
      System.out.println(RED + "Hotel was successfully updated.");
      return true;
    }
    return false;
  }

  @Override
  public void setRoomToTheHotel() {

  }
}
