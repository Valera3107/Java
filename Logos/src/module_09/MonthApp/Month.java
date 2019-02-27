package module_09.MonthApp;

public enum Month {

  JANUARY(31, Season.WINTER),
  FEBRUARY(28, Season.WINTER),
  MARCH(31, Season.SPRING),
  APRIL(30, Season.SPRING),
  MAY(31, Season.SPRING),
  JUNE(30, Season.SUMMER),
  JULY(31, Season.SUMMER),
  AUGUST(31, Season.SUMMER),
  SEPTEMBER(30, Season.AUTUMN),
  NOVEMBER(31, Season.AUTUMN),
  OCTOBER(30, Season.AUTUMN),
  DECEMBER(31, Season.WINTER);

  private int day;
  private Season season;

  Month(int day, Season season) {
    this.day = day;
    this.season = season;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public Season getSeason() {
    return season;
  }

  public void setSeason(Season season) {
    this.season = season;
  }

}
