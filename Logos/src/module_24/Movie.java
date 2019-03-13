package module_24;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
  private String title;
  private Time duration;
  private int stars;

  public Movie(String title, Time duration, int stars) {
    this.title = title;
    this.duration = duration;
    this.stars = stars;
  }

  public String getTitle() {
    return title;
  }

  public Time getDuration() {
    return duration;
  }

  public int getStars() {
    return stars;
  }

  @Override
  public String toString() {
    return this.title + " (" + this.duration + ")  " + getStars() + "*\n";
  }

  @Override
  public int compareTo(Movie o) {
    return this.getStars() - o.getStars();
  }
}
