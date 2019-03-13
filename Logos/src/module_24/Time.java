package module_24;

import java.util.Objects;

public class Time implements Comparable<Time> {
  private int hours;
  private int minutes;

  public Time(int hours, int minutes) throws TimeException {
    if (hours > 24 || hours < 0) {
      throw new TimeException();
    } else {
      this.hours = hours;
    }

    if (minutes > 60 || minutes < 0) {
      throw new TimeException();
    } else {
      this.minutes = minutes;
    }
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Time)) return false;
    Time time = (Time) o;
    return getHours() == time.getHours() &&
      getMinutes() == time.getMinutes();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHours(), getMinutes());
  }

  @Override
  public String toString() {
    return hours + ":" + minutes;
  }

  @Override
  public int compareTo(Time o) {
    if (this.hours != o.getHours()) return this.hours - o.getHours();
    else return this.minutes - o.getMinutes();
  }
}
