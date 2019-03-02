/**
 * LOGOS IT ACADEMY homework application file
 */
package module_12.MonthApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @since java 1.9
 * @author Petrunia Valera
 * @version 1.0
 * */

public class MonthApplication {

  /**
   * @param no input params
   * @exception InputMismatchException, WrongInputConsoleParametersException
   * @author Petrunia Valera
   * @return null
   * @see Month control application
   * */

  /*static variables with all seasons and months*/
  private static ArrayList<Month> months =new ArrayList<>(Arrays.asList(Month.values()));
  private static ArrayList<Season> seasons = new ArrayList<>(Arrays.asList(Season.values()));

  /*main method for application work*/
  public void startWork() {
    boolean isStop = false;
    int choice;
    Scanner scanner = new Scanner(System.in);
    printQuestions();
    while (!isStop) {
      System.out.println("Input number [1-11]");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          checkMonth();
          break;
        case 2:
          printAllMonths();
          break;
        case 3:
          sameDaysAmount();
          break;
        case 4:
          try {
            lessDaysAmount();
          } catch (InputMismatchException e) {
            e.printStackTrace();
          }
          break;
        case 5:
          try {
            biggerDaysAmount();
          } catch (InputMismatchException e) {
            e.printStackTrace();
          }
          break;
        case 6:
          nextSeason();
          break;
        case 7:
          prevSeason();
          break;
        case 8:
          printEvenDaysAmount();
          break;
        case 9:
          printOddDaysAmount();
          break;
        case 10:
          haveEven();
          break;
        case 11:
          isStop = true;
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }
    }
  }

  /*check if month is exists*/
  private static void checkMonth() {
    Scanner sc = new Scanner(System.in);
    boolean isValid = false;
    System.out.println("Input month: ");
    String month = sc.nextLine().toUpperCase();
    for (Month m : months
      ) {
      if (m.toString().equals(month)) {
        System.out.println("This month exists, have " + m.getDay() + " days and " + m.getSeason() + " season.");
        isValid = true;
      }
    }
    if (!isValid) try {
      throw new WrongInputConsoleParametersException("This month is not exist!");
    } catch (WrongInputConsoleParametersException e) {
      e.printStackTrace();
    }
  }

  /*print all months from static month array*/
  private static void printAllMonths() {
    for (Month m : months
      ) {
      System.out.println(m);
    }
  }

  /*look for months with same days amount*/
  private static void sameDaysAmount() {
    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    System.out.println("Input number of the days:");
    int days = scanner.nextInt();
    for (Month m : months
      ) {
      if (m.getDay() == days) {
        System.out.println(m);
        isValid = true;
      }
    }
    if (!isValid) try {
      throw new WrongInputConsoleParametersException("No month which has such number of the days.");
    } catch (WrongInputConsoleParametersException e) {
      e.printStackTrace();
    }
  }

  /*look for months with less days amount*/
  private static void lessDaysAmount() throws InputMismatchException {
    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    System.out.println("Input number of the days:");
    int days = scanner.nextInt();
    for (Month m : months
      ) {
      if (m.getDay() < days) {
        System.out.println(m);
        isValid = true;
      }
    }
    if (!isValid) try {
      throw new WrongInputConsoleParametersException("No month which has such number of the days.");
    } catch (WrongInputConsoleParametersException e) {
      e.printStackTrace();
    }
  }

  /*look for months with bigger days amount*/
  private static void biggerDaysAmount() throws InputMismatchException {
    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    System.out.println("Input number of the days:");
    int days = scanner.nextInt();
    for (Month m : months
      ) {
      if (m.getDay() > days) {
        System.out.println(m);
        isValid = true;
      }
    }
    if (!isValid) try {
      throw new WrongInputConsoleParametersException("No month which has such number of the days.");
    } catch (WrongInputConsoleParametersException e) {
      e.printStackTrace();
    }
  }

  /*show the next season after input season*/
  private static void nextSeason() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input season:");
    String season = scanner.nextLine().toUpperCase();
    try {
      Season season1 = Season.valueOf(season);
      int ordinal = season1.ordinal();
      if (ordinal == (seasons.size() - 1)) {
        ordinal = -1;
      }
      System.out.println(seasons.get(ordinal + 1));
      throw new WrongInputConsoleParametersException("Invalid season input!!!");
    } catch (WrongInputConsoleParametersException | IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  /*show the previous season after input season*/
  private static void prevSeason() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input season:");
    String season = scanner.nextLine().toUpperCase();
    try {
      Season season1 = Season.valueOf(season);
      int ordinal = season1.ordinal();
      if (ordinal == 0) {
        ordinal = 4;
      }
      System.out.println(seasons.get(ordinal - 1));
      throw new WrongInputConsoleParametersException("Invalid season input!!!");
    } catch (WrongInputConsoleParametersException | IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  /*print all months with even days amount*/
  private static void printEvenDaysAmount() {
    for (Month m : months
      ) {
      if (m.getDay() % 2 == 0) System.out.println(m);
    }
  }

  /*print all months with odd days amount*/
  private static void printOddDaysAmount() {
    for (Month m : months
      ) {
      if (m.getDay() % 2 != 0) System.out.println(m);
    }
  }

  /*check if month has even days amount */
  private static void haveEven() {
    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    System.out.println("Input month:");
    String month = scanner.nextLine().toUpperCase();
    for (Month m : months
      ) {
      if (m.toString().equals(month) && m.getDay() % 2 == 0) {
        System.out.println("Yes, this month has even amount of the days.");
        isValid = true;
      }
    }
    if (!isValid) try {
      throw new WrongInputConsoleParametersException("No, this month has not even amount of the days.");
    } catch (WrongInputConsoleParametersException e) {
      e.printStackTrace();
    }
  }

  /*print all functional of the application*/
  private static void printQuestions() {
    System.out.println("1 - Check month" +
      "\n2 - Print all months" +
      "\n3 - Print months with the same amount of the days" +
      "\n4 - Print months with less amount of the days" +
      "\n5 - Print months with bigger amount of the days" +
      "\n6 - Print next season" +
      "\n7 - Print previous season" +
      "\n8 - Print all months which have even amount of the days" +
      "\n9 - Print all months which have odd amount of the days" +
      "\n10 - Does this month has even amount of the days ?" +
      "\n11 - Stop work");
  }
}
