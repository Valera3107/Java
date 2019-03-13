package module_24;

import java.util.*;
import java.util.function.Supplier;

public class Main {
  private static List<Cinema> list = new ArrayList<>();
  private static Supplier<Integer> getCinemaIndex = () -> {
    list.forEach(e -> System.out.println(e.getName()));
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input index of the cinema:(0-" + (list.size() - 1)+")");
    return scanner.nextInt();
  };
  private static Supplier<Days> getSeanceIndex = () -> {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input day number: (0-6)(Mn-Sun)");
    return Cinema.days[scanner.nextInt()];
  };

  public static void main(String[] args) throws TimeException {
    boolean isStop = false;
    Fill.fillCinemaList(list);
    int choice;
    Scanner scanner = new Scanner(System.in);
    printOptions();
    while (!isStop) {
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          addMovie();
          break;
        case 2:
          deleteFilm();
          break;
        case 3:
          clearSeance();
          break;
        case 4:
          deleteSeance();
          break;
        case 5:
          printSeance();
          break;
        case 6:
          printCinema();
          break;
        case 7:
          getTheMostPopularFilm();
          break;
        case 8:
          getTheLeastPopularFilm();
          break;
        case 9:
          getTopFiveFilms();
          break;
        case 10:
          getFilmByDay();
          break;
        case 11:
          printAll();
          break;
        case 12:
          printOptions();
          break;
        case 13:
          isStop = true;
          break;
        default:
          System.out.println("Invalid input!");
          break;
      }
    }
  }

  private static void addMovie() {
    list.get(getCinemaIndex.get()).addFilm();
  }

  private static void deleteFilm() {
    list.get(getCinemaIndex.get()).removeFilm();
  }

  private static void clearSeance() {
    list.get(getCinemaIndex.get()).clearSeance();
  }

  private static void deleteSeance() {
    list.get(getCinemaIndex.get()).deleteSeances();
  }

  private static void printSeance() {
    list.get(getCinemaIndex.get()).getDaysMap().get(getSeanceIndex.get()).getSchedule().forEach(System.out::println);
  }

  private static void printCinema() {
    list.forEach(e -> System.out.println(e.getName()));
  }

  private static void getTheMostPopularFilm() {
    System.out.println(list.get(getCinemaIndex.get()).getPopularFilm());
  }

  private static void getTheLeastPopularFilm() {
    System.out.println(list.get(getCinemaIndex.get()).getUnPopularFilm());
  }

  private static void getTopFiveFilms() {
    list.get(getCinemaIndex.get()).getDaysMap().get(getSeanceIndex.get()).getSchedule().stream().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
  }

  private static void getFilmByDay() {
    list.get(getCinemaIndex.get()).getFilmsByDay();
  }

  private static void printAll() {
    list.forEach(Cinema::printWeek);
  }

  private static void printOptions() {
    System.out.println(
      "1 - add movie\n" +
        "2 - delete movie\n" +
        "3 - clear seance\n" +
        "4 - delete seance\n" +
        "5 - print seance\n" +
        "6 - print cinemas\n" +
        "7 - get the most popular film\n" +
        "8 - get the least popular film\n" +
        "9 - get top 5 films\n" +
        "10 - get films by day\n" +
        "11 - print all\n" +
        "12 - get options\n" +
        "13 - stop work.");
  }
}
