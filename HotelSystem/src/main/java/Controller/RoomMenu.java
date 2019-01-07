package Controller;

import DAO.Implementations.RoomWork;
import Model.Room;

import java.util.Scanner;

import static Service.Colors.BLUE;

public class RoomMenu {
  public static final String ROOM_PATH = "roomDB.bin";

  public void menu() {
    RoomWork work = new RoomWork();
    boolean isStop = false;
    Scanner scanner = new Scanner(System.in);
    int choice;
    while (!isStop) {
      System.out.println(BLUE +
        "1 - get all rooms\n" +
        "2 - get room by id\n" +
        "3 - get rooms by city\n" +
        "4 - delete room by id\n" +
        "5 - create new room\n" +
        "6 - get free rooms at hotel\n" +
        "7 - update room\n" +
        "8 - add user to rhe room\n" +
        "9 - delete user from the room\n" +
        "10 - return to the main menu");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          work.getAllRooms().forEach(System.out::println);
          break;
        case 2:
          System.out.println(work.getRoomById());
          break;
        case 3:
          work.getRoomsByCity().forEach(System.out::println);
          break;
        case 4:
          work.deleteRoomById();
          break;
        case 5:
          work.createNewRoom();
          break;
        case 6:
          work.getFreeRooms().forEach(System.out::println);
          break;
        case 7:
          work.updateRoom();
          break;
        case 8:
          work.addUser();
          break;
        case 9:
          work.releaseRoom();
          break;
        case 10:
          isStop = true;
          break;
        default:
          System.out.println("Invalid input. Try again!");
          break;
      }
      scanner.nextLine();
    }
  }
}
