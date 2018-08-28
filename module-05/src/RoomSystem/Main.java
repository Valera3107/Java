package RoomSystem;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Room room1 = new Room(0001, 340, 1, new Date(2018, 8, 28), "Paradise", "Las Vegas");
    Room room2 = new Room(0010, 200, 3, new Date(2018, 11, 8), "BlackWhite", "Los Angeles");
    Room room3 = new Room(0011, 650, 4, new Date(2018, 1, 10), "Sun Rise", "Antalya");
    Room room4 = new Room(0100, 760, 1, new Date(2018, 9, 4), "Van De Bah", "Pekin");
    Room room5 = new Room(0101, 210, 2, new Date(2018, 6, 8), "Earth", "Germany");

//    System.out.println(room1.equals(room2));
//    System.out.println(room1.hashCode() == room2.hashCode());
  }
}
