package module_24;

import java.util.*;
import java.util.function.Supplier;

public class Cinema {
  private Map<Days, Seance> daysMap = new TreeMap<>();
  private Time open;
  private Time close;
  private String name;
  public static final Days[] days = Days.values();
  private Supplier<Integer> getHours = () -> Math.abs(getClose().getHours() - getOpen().getHours());
  private Supplier<Integer> getMinutes = () -> Math.abs(getClose().getMinutes() - getOpen().getHours());
  private Supplier<Days> getDays = () -> {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input day number: (0-6)(Mn-Sun)");
    return days[scanner.nextInt()];
  };

  public Cinema(String name, Time open, Time close) {
    this.name = name;
    this.open = open;
    this.close = close;
  }

  public Map<Days, Seance> getDaysMap() {
    return daysMap;
  }

  public Time getOpen() {
    return open;
  }

  public Time getClose() {
    return close;
  }

  public String getName() {
    return name;
  }

  public void addSeance(Days day, Seance seance) {
    if (seance.getHours() < getHours.get()) {
      daysMap.put(day, seance);
    } else if (seance.getHours() == getHours.get() && seance.getMinutes() < getMinutes.get()) {
      daysMap.put(day, seance);
    } else
      System.out.println("Seance has more then cinema hours and minutes, please delete film!");
  }

  public void addFilm() {
    daysMap.get(getDays.get()).addFilm();
    System.out.println("Film added!");
  }

  public void removeFilm() {
    daysMap.get(getDays.get()).removeFilm();
    System.out.println("Film deleted!");
  }

  public void clearSeance() {
    daysMap.get(getDays.get()).getSchedule().clear();
    System.out.println("Seance is clear!");
  }

  public void deleteSeances() {
    daysMap.remove(getDays.get());
    System.out.println("Seance deleted!");
  }

  public Movie getPopularFilm() {
    return daysMap.get(getDays.get()).getSchedule().stream().sorted((e1, e2) -> e2.getStars() - e1.getStars()).findFirst().get();
  }

  public Movie getUnPopularFilm() {
    return daysMap.get(getDays.get()).getSchedule().stream().findFirst().get();
  }

  public void getFilmsByDay(){
    daysMap.get(getDays.get()).getSchedule().forEach(System.out::println);
  }

  public void printWeek() {
    System.out.println("\n>== " + getName().toUpperCase() + " ==<\n");
    getDaysMap().keySet().forEach(e -> System.out.println(e + "\n" + daysMap.get(e)));
    System.out.println("\n\n=============================\n\n");
  }
}
