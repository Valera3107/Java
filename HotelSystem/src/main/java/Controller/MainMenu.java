package Controller;

import java.util.Scanner;

import static Service.Colors.BLUE;
import static Service.Colors.GREEN;
import static Service.Colors.RED;

public class MainMenu {
  public void start() {
    boolean isStop = false;
    Scanner scanner = new Scanner(System.in);
    int choice;
    while (!isStop) {
      System.out.println(RED + "1 - Hotel menu");
      System.out.println(BLUE + "2 - Room menu");
      System.out.println(GREEN + "3 - User menu");
      System.out.println("4 - end work");
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
        default:
          System.out.println("Invalid input. Try again!");
          break;
      }
      scanner.nextLine();
    }
  }
}

