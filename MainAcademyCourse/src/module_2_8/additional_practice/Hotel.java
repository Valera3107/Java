package module_2_8.additional_practice;

public class Hotel {
  private HotelRoom[] rooms;

  public Hotel(HotelRoom[] rooms) {
    this.rooms = rooms;
  }

  public HotelRoom[] getRooms() {
    return rooms;
  }

  public void setRooms(HotelRoom[] rooms) {
    this.rooms = rooms;
  }

  public void settleTeam(Team team) {
    for (int i = 0; i < rooms.length; i++) {
      rooms[i].setPlace(team.getSportsmen()[i]);
    }
  }
}
