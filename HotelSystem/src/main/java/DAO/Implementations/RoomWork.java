package DAO.Implementations;

import Controller.HotelMenu;
import Controller.RoomMenu;
import Controller.UserMenu;
import DAO.DAOs.RoomDAO;
import Model.Room;
import Model.User;
import Service.DataBase;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Service.Colors.BLUE;

public class RoomWork implements RoomDAO {
  DataBase db = new DataBase();
  Scanner scanner = new Scanner(System.in);

  @Override
  public List getAllRooms() {
    return db.getRooms(RoomMenu.ROOM_PATH);
  }

  @Override
  public Room getRoomById() {
    System.out.println(BLUE + "Input id: ");
    int id = scanner.nextInt();
    return db.getRooms(RoomMenu.ROOM_PATH).stream().filter(e -> e.getId() == id).collect(Collectors.toList()).get(0);
  }

  @Override
  public List getRoomsByCity() {
    System.out.println(BLUE + "Input city:");
    String city = scanner.nextLine();
    return db.getRooms(RoomMenu.ROOM_PATH).stream().filter(e -> e.getCity() == city).collect(Collectors.toList());
  }

  @Override
  public boolean deleteRoomById() {
    List<Room> rooms = getAllRooms();
    if (rooms.remove(getRoomById())) {
      db.writeRoom(rooms, HotelMenu.HOTEL_PATH);
      System.out.println(BLUE + "Room was successfully deleted from DB.");
      return true;
    }
    return false;
  }

  @Override
  public boolean createNewRoom() {
    List<Room> rooms = getAllRooms();
    String city;
    int roomNumber, price;
    Room newRoom;
    System.out.println(BLUE + "Input new room number, city and price for this room");
    roomNumber = scanner.nextInt();
    city = scanner.nextLine();
    price = scanner.nextInt();
    newRoom = new Room(roomNumber, price, city);
    if (rooms.add(newRoom)) {
      db.writeRoom(rooms, RoomMenu.ROOM_PATH);
      System.out.println(BLUE + "New room has successfully added.");
      return true;
    }
    return false;
  }

  @Override
  public List gerFreeRooms() {
    return db.getRooms(RoomMenu.ROOM_PATH).stream().filter(Room::isReserved).collect(Collectors.toList());
  }

  @Override
  public boolean updateRoom() {
    Room room = getRoomById();
    String city;
    int roomNumber, price;
    System.out.println(BLUE + "Input new room number, city and price for this room");
    roomNumber = scanner.nextInt();
    city = scanner.nextLine();
    price = scanner.nextInt();
    room.setCity(city);
    room.setPrice(price);
    room.setRoomNumber(roomNumber);
    List<Room> rooms = db.readRooms(RoomMenu.ROOM_PATH);
    if (rooms.remove(rooms.stream().filter(e -> e.getId() == room.getId()).collect(Collectors.toList()).get(0))
      ) {
      rooms.add(room);
      db.writeRoom(rooms, RoomMenu.ROOM_PATH);
      System.out.println(BLUE + "Room was successfully updated.");
      return true;
    }
    return false;
  }

  @Override
  public void addUser() {
    List<Room> roomList = db.readRooms(RoomMenu.ROOM_PATH).stream().peek(System.out::println).collect(Collectors.toList());
    System.out.println("Choose room id:");
    Room room = getRoomById();
    System.out.println("Choose user by id:");
    db.readUsers(UserMenu.USER_PATH).forEach(System.out::println);
    User user = new UserWork().getUserById();
    room.setUser(user);
    roomList.remove(room);
    roomList.add(room);
    db.writeRoom(roomList, RoomMenu.ROOM_PATH);
  }

  @Override
  public void releaseRoom() {
    List<Room> roomList = db.readRooms(RoomMenu.ROOM_PATH).stream().peek(System.out::println).collect(Collectors.toList());
    System.out.println("Choose room id:");
    Room room = getRoomById();
    System.out.println("Choose user by id:");
    db.readUsers(UserMenu.USER_PATH).forEach(System.out::println);
    User user = new UserWork().getUserById();
    room.releaseRoomFromUser(user);
    roomList.remove(room);
    roomList.add(room);
    db.writeRoom(roomList, RoomMenu.ROOM_PATH);
  }
}
