package Controller;

import DAO.Implementations.UserWork;

import java.util.Scanner;

import static Service.Colors.GREEN;

public class UserMenu {
  public static final String USER_PATH = "userDb.bin";

  public void menu() {
    Scanner scanner = new Scanner(System.in);
    int choice;
    boolean isStop = false;
    while (!isStop) {
      System.out.println(GREEN +
        "1 - registered new user\n" +
        "2 - delete user\n" +
        "3 - get all users\n" +
        "4 - get user by id\n" +
        "5 - return to the main menu");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          new UserWork().addNewUser();
          break;
        case 2:
          new UserWork().deleteUserById();
          break;
        case 3:
          new UserWork().getAllUsers().forEach(System.out::println);
          break;
        case 4:
          System.out.println(new UserWork().getUserById());
          break;
        case 5:
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
