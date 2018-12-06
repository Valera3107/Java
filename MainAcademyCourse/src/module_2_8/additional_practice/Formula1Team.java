package module_2_8.additional_practice;

public class Formula1Team implements Team {
  private Formula1Racer[] team;
  private CoachOfSportsman coach;

  public Formula1Team(Formula1Racer[] team, CoachOfSportsman coach) {
    this.team = team;
    this.coach = coach;
  }

  public CoachOfSportsman getCoach() {
    return coach;
  }

  @Override
  public Sportsman[] getSportsmen() {
    return team;
  }
}
