package module_2_8.additional_practice;

public class FootballPlayer implements Sportsman, Coach {
  private String name;
  private String sport = "football";
  private String coachName;


  public FootballPlayer(String name) {
    this.name = name;
  }

  public void setName(String name) {
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
