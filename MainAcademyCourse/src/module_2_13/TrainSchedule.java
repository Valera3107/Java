package module_2_13;

import java.util.Scanner;

public class TrainSchedule {
  private Train[] trains;

  public TrainSchedule(Train[] trains) {
    this.trains = trains;
  }

  public void addTrain(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input stationDispatch :");
    String stationDispatch = sc.nextLine();

    System.out.println("Input stationArrival :");
    String stationArrival = sc.nextLine();

    System.out.println("Input timeDispatch :");
    String timeDispatch = sc.nextLine();

    System.out.println("Input timeArrival :");
    String timeArrival = sc.nextLine();

    System.out.println("Input number of day (0-6):");
    int num = sc.nextInt();

    DayOfWeek day = DayOfWeek.values()[num];

    for (int i = 0; i < trains.length; i++) {
      if(trains[i] == null) {
        trains[i] = new Train(i);
        trains[i].setStationArrival(stationArrival);
        trains[i].setDay(day);
        trains[i].setTimeArrival(timeArrival);
        trains[i].setTimeDispatch(timeDispatch);
        trains[i].setStationDispatch(stationDispatch);
      }
    }
  }

  public void printTrains() {
    for (Train tr : trains
         ) {
      System.out.println(tr.toString());
    }
  }

  public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day) {
    for (Train tr : trains
         ) {
      if(tr.getDay() == day && tr.getStationArrival() == stationArrival && tr.getStationDispatch() == stationDispatch) {
        System.out.println(tr.toString());
      }
    }
  }

  class Train {
    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    private DayOfWeek day;

    public Train(int number) {
      this.number = number;
    }

    public int getNumber() {
      return number;
    }

    public void setNumber(int number) {
      this.number = number;
    }

    public String getStationDispatch() {
      return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
      this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
      return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
      this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
      return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
      this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
      return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
      this.timeArrival = timeArrival;
    }

    public DayOfWeek getDay() {
      return day;
    }

    public void setDay(DayOfWeek day) {
      this.day = day;
    }

    @Override
    public String toString() {
      return "Train{" +
        "number=" + number +
        ", stationDispatch='" + stationDispatch + '\'' +
        ", stationArrival='" + stationArrival + '\'' +
        ", timeDispatch='" + timeDispatch + '\'' +
        ", timeArrival='" + timeArrival + '\'' +
        ", day=" + day +
        '}';
    }
  }
}
