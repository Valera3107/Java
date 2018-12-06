package module_2_8.additional_practice;

public class Formula1Racer implements Sportsman, Coach{
  private String name;
  private String sport = "Formula1Racer";
  private String coachName;

  public Formula1Racer(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getSport() {
    return sport;
  }

  @Override
  public String getCoachName() {
    return coachName;
  }
}
