package module_2_8.additional_practice;

public class FootballTeam implements Team{
  private FootballPlayer[] team;
  private CoachOfSportsman coach;

  public FootballTeam(FootballPlayer[] team, CoachOfSportsman coach) {
    this.team = team;
    this.coach = coach;
  }

  @Override
  public Sportsman[] getSportsmen() {
    return this.team;
  }

  public CoachOfSportsman getCoach() {
    return coach;
  }
}
