package module_2_13;

public enum DayOfWeek {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

  public DayOfWeek nextDay() {
    for (int i = 0; i < DayOfWeek.values().length; i++) {
      if(this.name() == DayOfWeek.values()[i].name()) {
        return DayOfWeek.values()[i+1];
      }
    }
    return null;
  }
}
