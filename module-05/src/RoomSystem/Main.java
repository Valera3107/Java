package RoomSystem;

import RoomSystem.API.BookingComAPI;
import RoomSystem.DAO.DAOInterface;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    DAOInterface roomInterface = new DAOInterface();
    //BookingComAPI roomApi = new BookingComAPI();

    Room room1 = new Room(0001, 340, 1, new Date(2018, 8, 28), "Paradise", "Las Vegas");
    Room room2 = new Room(0010, 200, 3, new Date(2018, 11, 8), "BlackWhite", "Los Angeles");
    Room room3 = new Room(0011, 650, 4, new Date(2018, 1, 10), "Sun Rise", "Antalya");
    Room room4 = new Room(0100, 760, 1, new Date(2018, 9, 4), "Van De Bah", "Pekin");
    Room room5 = new Room(0101, 210, 2, new Date(2018, 6, 8), "Earth", "Germany");

    roomInterface.save(room1);
    roomInterface.save(room2);
    roomInterface.save(room3);
    roomInterface.save(room4);
    roomInterface.save(room5);

    roomInterface.findById(0011);
    roomInterface.update(room3);
    System.out.println(roomInterface.delete(room4));
    //roomApi.findRooms(760, 4, "Antalya", "Sun Rise");
//    System.out.println(room1.equals(room6));
//    System.out.println(room1.hashCode() == room6.hashCode());

  }


}
