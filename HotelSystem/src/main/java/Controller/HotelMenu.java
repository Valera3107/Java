package Controller;

import DAO.Implementations.HotelWork;

import java.util.Scanner;

import static Service.Colors.RED;

public class HotelMenu {
  public static final String HOTEL_PATH = "hotelDB.bin";
  HotelWork work = new HotelWork();

  public void menu() {
    boolean isStop = false;
    Scanner scanner = new Scanner(System.in);
    int choice;
    while (!isStop) {
      System.out.println(RED +
        "1 - get all hotels\n" +
        "2 - get hotel by id\n" +
        "3 - get hotels by city\n" +
        "4 - delete hotel by id\n" +
        "5 - create new hotel\n" +
        "6 - get rooms at hotel\n" +
        "7 - update hotel\n" +
        "8 - return to the main menu");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          work.getAllHotels().stream().forEach(System.out::println);
          break;
        case 2:
          work.getHotelById();
          break;
        case 3:
          work.getHotelsByCity();
          break;
        case 4:
          work.deleteHotelById();
          break;
        case 5:
          work.createNewHotel();
          break;
        case 6:
          work.updateHotel();
          break;
        case 7:
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
