package module_2_8.additional_practice;

public class Bus {
  private static final int NUMBER_OF_PLACE_IN_THE_BUS = 40;
  private BusPlace[] places;

  public Bus(BusPlace[] places) {
    this.places = places;
  }

  public void settleSportsmen(Sportsman[] sportsmen) {
    for (int i = 0; i < NUMBER_OF_PLACE_IN_THE_BUS; i++) {
      places[i].setPlace(sportsmen[i]);
    }
  }

  public BusPlace[] getPlaces() {
    return places;
  }
}
