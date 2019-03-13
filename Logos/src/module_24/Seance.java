package module_24;

import java.util.*;
import java.util.function.Supplier;


public class Seance {
  private SortedSet<Movie> schedule = new TreeSet<>();
  private int hours;
  private int minutes;
  private Supplier<Movie> filmBuilder = this::generateMovie;
  private Supplier<Integer> getHours = () -> schedule.stream().map(h -> h.getDuration().getHours()).reduce(0, (e1, e2) -> e1 + e2);
  private Supplier<Integer> getMinutes = () -> schedule.stream().map(m -> m.getDuration().getMinutes()).reduce(0, (e1, e2) -> e1 + e2);


  public Seance(SortedSet<Movie> schedule) {
    this.schedule = schedule;
    this.hours = getHours.get();
    checkTime();
  }

  public Set<Movie> getSchedule() {
    return schedule;
  }

  public int getHours() {
    return hours;
  }

  public int getMinutes() {
    return minutes;
  }

  private Movie generateMovie() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input title of the film:");
    String name = scanner.nextLine();
    System.out.println("Input hours: (0-24)");
    int hours = scanner.nextInt();
    System.out.println("Input minutes: (0-60)");
    int minutes = scanner.nextInt();
    System.out.println("Input stars:");
    int stars = scanner.nextInt();
    try {
      return new Movie(name, new Time(hours, minutes), stars);
    } catch (TimeException timeException) {
      timeException.printStackTrace();
    }
    return null;
  }

  public void addFilm() {
    schedule.add(filmBuilder.get());
    checkTime();
  }

  private void checkTime() {
    this.hours = getHours.get();
    if (getMinutes.get() > 60) {
      int h = getMinutes.get() / 60;
      this.hours += h;
      this.minutes = getMinutes.get() - h * 60;
    } else {
      this.minutes = getMinutes.get();
    }
  }

  public void removeFilm() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input title of the film:");
    String name = scanner.nextLine();
    schedule.removeIf(x -> x.getTitle().toLowerCase().compareTo(name.toLowerCase()) == 0);
    checkTime();
  }

  @Override
  public String toString() {
    return "Hours: " + getHours() + " minutes: " + getMinutes() + "\nSeances:\n" + getSchedule() + "\n";
  }
}
