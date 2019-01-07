package Service;

import Model.Hotel;
import Model.Room;
import Model.User;

import java.util.ArrayList;
import java.util.List;

import static Service.Colors.BLACK;

public class Utils {

  public static int generateId() {
    return 100 + (int) (Math.random() * 1000);
  }

  public static List<Hotel> generateHotels() {
    List<Hotel> hotels = new ArrayList<>();
    hotels.add(new Hotel("Hilton", "Los Angeles", 10));
    hotels.add(new Hotel("Plaza", "Amsterdam", 8));
    hotels.add(new Hotel("Cristal Palace", "New York", 12));
    hotels.add(new Hotel("Golden", "Los Angeles", 9));
    hotels.add(new Hotel("Nature Hotel", "Amsterdam", 15));
    hotels.add(new Hotel("Space", "New York", 7));
    hotels.add(new Hotel("New-Your-Hotel", "Los Angeles", 10));
    hotels.add(new Hotel("Jahat", "Amsterdam", 10));
    hotels.add(new Hotel("101-H", "New York", 13));
    return hotels;
  }

  public static List<Room> generateRooms() {
    List<Room> rooms = new ArrayList<>();
    rooms.add(new Room(1, 1250, "Moscow"));
    rooms.add(new Room(2, 950, "Kiev"));
    rooms.add(new Room(3, 450, "Los Angeles"));
    rooms.add(new Room(4, 430, "Amsterdam"));
    rooms.add(new Room(5, 1900, "Los Angeles"));
    rooms.add(new Room(6, 1500, "New York"));
    rooms.add(new Room(7, 2360, "New York"));
    rooms.add(new Room(8, 560, "Amsterdam"));
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

  public static void printWall() {
    System.out.println(BLACK + "==========================================================");
  }
}
