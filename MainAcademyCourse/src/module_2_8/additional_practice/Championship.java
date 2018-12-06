package module_2_8.additional_practice;

public class Championship implements IChampionship {
  private Team[] teams;

  public Championship(Team[] teams) {
    this.teams = teams;
  }

  public Team[] getTeams() {
    return teams;
  }

  @Override
  public void makeChampionship(String sport) {
    System.out.println("Championship of " + sport + " in which has team of: ");
    for (int i = 0; i < teams.length; i++) {
      if (teams[i].getSportsmen()[0].getSport() == sport) {
        for (int j = 0; j < teams[i].getSportsmen().length; j++) {
          System.out.println(teams[i].getSportsmen()[j].getName());
        }
      }
    }
  }
}
