package Controller;

import Service.DataBase;
import Service.Utils;

import java.util.Scanner;

import static Service.Colors.*;

public class MainMenu {
  private static boolean isFirstLaunch = true;
  public void firstLaunch() {
    DataBase db = new DataBase();
    db.writeUser(Utils.generateUsers(), UserMenu.USER_PATH);
    db.writeRoom(Utils.generateRooms(), RoomMenu.ROOM_PATH);
    db.writeHotel(Utils.generateHotels(), HotelMenu.HOTEL_PATH);
    isFirstLaunch = false;
  }

  public void start() {
    boolean isStop = false;
    Scanner scanner = new Scanner(System.in);
    int choice;
    while (!isStop) {
      System.out.println(RED + "1 - Hotel menu");
      System.out.println(BLUE + "2 - Room menu");
      System.out.println(GREEN + "3 - User menu");
      System.out.println("4 - end work");
      if (isFirstLaunch) {
        System.out.println(PURPLE + "5 - IF IT IS FIRST LAUNCH, CHOOSE IT !!!");
      }
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          new HotelMenu().menu();
          break;
        case 2:
          new RoomMenu().menu();
          break;
        case 3:
          new UserMenu().menu();
          break;
        case 4:
          isStop = true;
          break;
        case 5:
          if (isFirstLaunch) {
            firstLaunch();
          } else {
            System.out.println("You use program not first time! Choose another command.");
          }
          break;
        default:
          System.out.println("Invalid input. Try again!");
          break;
      }
      scanner.nextLine();
    }
  }
}

