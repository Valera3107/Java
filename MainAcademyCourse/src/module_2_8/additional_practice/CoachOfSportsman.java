package module_2_8.additional_practice;

public class CoachOfSportsman implements Coach {
  private String name;
  private String sport;

  public CoachOfSportsman(String name, String sport) {
    this.name = name;
    this.sport = sport;
  }

  @Override
  public String getCoachName() {
    return this.name;
  }

  @Override
  public String getSport() {
    return this.sport;
  }
}
