package module_2_8.additional_practice;

public class ChessTeam implements Team{
  private ChessPlayer[] team;
  private CoachOfSportsman coach;

  public ChessTeam(ChessPlayer[] team, CoachOfSportsman coach) {
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
