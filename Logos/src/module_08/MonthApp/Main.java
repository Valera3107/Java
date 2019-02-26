package module_08.MonthApp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Month[] months = Month.values();

  public static void main(String[] args) {
    boolean isStop = false;
    int choice;
    Scanner scanner = new Scanner(System.in);
    printQuastions();
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
          lessDaysAmount();
          break;
        case 5:
          biggerDaysAmount();
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

  private static void checkMonth() {
    Scanner sc = new Scanner(System.in);
    boolean isExist = false;
    System.out.println("Input month: ");
    String month = sc.nextLine().toUpperCase();
    for (Month m : months
      ) {
      if (m.toString().equals(month)) {
        System.out.println("This month exists, have " + m.getDay() + " days and " + m.getSeason() + " season.");
        isExist = true;
      }
    }
    if (!isExist) System.out.println("This month is not exist!");
  }

  private static void printAllMonths() {
    for (Month m : months
      ) {
      System.out.println(m);
    }
  }

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
    if (!isValid) System.out.println("No month which has such number of the days.");
  }

  private static void lessDaysAmount() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of the days:");
    int days = scanner.nextInt();
    for (Month m : months
      ) {
      if (m.getDay() < days) {
        System.out.println(m);
      }
    }
  }

  private static void biggerDaysAmount() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of the days:");
    int days = scanner.nextInt();
    for (Month m : months
      ) {
      if (m.getDay() > days) {
        System.out.println(m);
      }
    }
  }

  private static void nextSeason() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input season:");
    String season = scanner.nextLine().toUpperCase();
    Season[] seasons = Season.values();
    Season season1 = Season.valueOf(season);
    int ordinal = season1.ordinal();
    if(ordinal == (seasons.length - 1)){
      ordinal = -1;
    }
    System.out.println(seasons[ordinal+1]);
  }

  private static void prevSeason() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input season:");
    String season = scanner.nextLine().toUpperCase();
    Season[] seasons = Season.values();
    Season season1 = Season.valueOf(season);
    int ordinal = season1.ordinal();
    if(ordinal == 0){
      ordinal = 4;
    }
    System.out.println(seasons[ordinal-1]);
  }

  private static void printEvenDaysAmount() {
    for (Month m : months
      ) {
      if (m.getDay() % 2 == 0) System.out.println(m);
    }
  }

  private static void printOddDaysAmount() {
    for (Month m : months
      ) {
      if (m.getDay() % 2 != 0) System.out.println(m);
    }
  }

  private static void haveEven() {
    Scanner scanner = new Scanner(System.in);
    boolean isEven = false;
    System.out.println("Input month:");
    String month = scanner.nextLine().toUpperCase();
    for (Month m : months
      ) {
      if (m.toString().equals(month) && m.getDay() % 2 == 0) {
        System.out.println("Yes, this month has even amount of the days.");
        isEven = true;
      }
    }
    if (!isEven) System.out.println("No, this month has not even amount of the days.");
  }

  private static void printQuastions() {
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
