package RoomSystem;

import RoomSystem.API.BookingComAPI;
import RoomSystem.API.GoogleAPI;
import RoomSystem.Controller.Controller;

public class Main {
  public static void main(String[] args) {

    Controller controller = new Controller();
    BookingComAPI bookingComAPI = new BookingComAPI();
    GoogleAPI googleAPI = new GoogleAPI();

    System.out.println("Common rooms:");
    for (Room room : controller.check(bookingComAPI, googleAPI)) {
      System.out.println(room);
    }

    System.out.println("\nFound rooms:");
    for (Room room : controller.requestRooms(1050, 2, "HotelCalifornia", "Miami")) {
      System.out.println(room);
    }

  }


}
