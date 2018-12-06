package module_2_8.additional_practice;

public class ChessPlayer implements Sportsman, Coach{
  private String name;
  private String sport = "chess";
  private String coachName;

  public ChessPlayer(String name) {
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

  public void setCoachName(String coachName) {
    this.coachName = coachName;
  }
}
