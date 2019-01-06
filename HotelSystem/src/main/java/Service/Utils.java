package Service;

import Model.Hotel;
import Model.Room;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {

  public static int generateId() {
    return 100 + (int) (Math.random() * 1000);
  }

  public static List<Hotel> generateHotels() {
    List<Hotel> hotels = new ArrayList<>();
    hotels.add(new Hotel("Hilton", "Los Angeles", 10));
    hotels.add(new Hotel("Plaza", "Amsterdam", 8));
    hotels.add(new Hotel("Cristal Palace", "New York", 12));
    return hotels;
  }

  public static List<Room> generateRooms() {
    List<Room> rooms = new ArrayList<>();
    rooms.add(new Room(1, 1250));
    rooms.add(new Room(2, 950));
    rooms.add(new Room(3, 450));
    rooms.add(new Room(4, 430));
    rooms.add(new Room(5, 1900));
    rooms.add(new Room(6, 1500));
    rooms.add(new Room(7, 2360));
    rooms.add(new Room(8, 560));
    return rooms;
  }

  public static List<User> generateUsers() {
    List<User> users = new ArrayList<>();
    users.add(new User("Frank", 34));
    users.add(new User("Peter", 42));
    users.add(new User("Nick", 54));
    users.add(new User("Tom", 81));
    users.add(new User("Antony", 24));
    users.add(new User("Sam", 65));
    return users;
  }

}
