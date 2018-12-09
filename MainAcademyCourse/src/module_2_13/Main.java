package module_2_13;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DayOfWeek[] dayOfWeek = DayOfWeek.values();
    for (DayOfWeek day : dayOfWeek
      ) {
      System.out.println(day.name());
    }

    //==============
    System.out.println("\n");

    for (DayOfWeek day : dayOfWeek) {
      switch (day) {
        case MONDAY:
          System.out.println(day.name() + " is my workin' day!");
          break;
        case WEDNESDAY:
          System.out.println(day.name() + " is my workin' day!");
          break;
        case FRIDAY:
          System.out.println(day.name() + " is my workin' day!");
          break;
        default:
          System.out.println("-");break;
      }
    }

    //================

    System.out.println("\n");
    System.out.println("The next day after " + DayOfWeek.FRIDAY.name() + " is " + DayOfWeek.FRIDAY.nextDay());

    Card[] deckOfCards = new Card[52];

    int count = 0;
    for (int i = 0; i < Suit.values().length; i++) {
      for (int j = 0; j < Rank.values().length; j++) {
        deckOfCards[count] = new Card(Suit.values()[i], Rank.values()[j]);
        count++;
      }
    }

    for (Card card : deckOfCards
         ) {
      System.out.println(card.toString());
    }

    //==================


    TrainSchedule trainSchedule = new TrainSchedule(new TrainSchedule.Train[10]);

    boolean stop = false;
    int choice;
    Scanner sc = new Scanner(System.in);
    while (!stop) {
      System.out.println("What do you want: 1 - add train, 2 - print trains, 3 - search train;");
      choice = sc.nextInt();

      switch (choice) {
        case 1: trainSchedule.addTrain();break;
        case 2: trainSchedule.printTrains();break;
        case 3:
          System.out.println("Input station dispatch:");
          String stationDispatch = sc.nextLine();
          System.out.println("input station arrival:");
          String stationArrival = sc.nextLine();
          System.out.println("Input day");
          DayOfWeek day = DayOfWeek.valueOf(sc.nextLine());
          trainSchedule.searchTrain(stationDispatch, stationArrival, day);
          default:
            System.out.println("Try again?(y/n)");
            String answer = sc.nextLine();
            if(answer == "y") stop = true;
            break;
      }
    }

  }
}
