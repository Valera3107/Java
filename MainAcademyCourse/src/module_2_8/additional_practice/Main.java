package module_2_8.additional_practice;

public class Main {
  public static void main(String[] args) {
    Sportsman[] sportsmen = {new FootballPlayer("Petr"), new FootballPlayer("Vasia"), new FootballPlayer("Dima"), new FootballPlayer("Lee")};

    for (Sportsman sp: sportsmen
         ) {
      System.out.println(sp.getName() + " play in " + sp.getSport());
    }

    Sportsman[] sportsmenChess = {new ChessPlayer("Frank"), new ChessPlayer("Alex"), new ChessPlayer("Tim")};

    for (Sportsman sp: sportsmenChess
         ) {
      System.out.println(sp.getName() + " play in " + sp.getSport());
    }

    Sportsman[] sportsmenFormula = {new Formula1Racer("Mark"), new Formula1Racer("Jack"), new Formula1Racer("Tomas")};

    for (Sportsman sp: sportsmenFormula
      ) {
      System.out.println(sp.getName() + " play in " + sp.getSport());
    }

    FootballPlayer footballPlayer1 = new FootballPlayer("Frank");
    FootballPlayer footballPlayer2 = new FootballPlayer("Mark");
    FootballPlayer footballPlayer3 = new FootballPlayer("Piter");


    Team team = new FootballTeam(new FootballPlayer[]{footballPlayer1, footballPlayer2, footballPlayer3}, new CoachOfSportsman("Borisov", "Football"));

    for (Sportsman fb: team.getSportsmen()
         ) {
      System.out.println(fb.getName() + " play in " + fb.getSport());
    }

    ChessPlayer chessPlayer1 = new ChessPlayer("Hook");
    ChessPlayer chessPlayer2 = new ChessPlayer("Anna");
    ChessPlayer chessPlayer3 = new ChessPlayer("Lee");

    ChessTeam chessTeam = new ChessTeam(new ChessPlayer[]{chessPlayer1, chessPlayer2, chessPlayer3}, new CoachOfSportsman("Paskin", "Chess"));

    for (Sportsman ct: chessTeam.getSportsmen()
         ) {
      System.out.println(ct.getName() + " play in " + ct.getSport());
    }

    Formula1Racer formula1Racer1 = new Formula1Racer("James");
    Formula1Racer formula1Racer2 = new Formula1Racer("James");
    Formula1Racer formula1Racer3 = new Formula1Racer("James");

   Formula1Team formulaTeam = new Formula1Team(new Formula1Racer[]{formula1Racer1, formula1Racer2, formula1Racer3}, new CoachOfSportsman("Tripin", "Formula1"));

    for (Sportsman fs: formulaTeam.getSportsmen()
         ) {
      System.out.println(fs.getName() + " play in " + fs.getSport());
    }

    HotelRoom[] rooms = new HotelRoom[200];

    Sportsman[] sportsmenToHotel = {new Formula1Racer("James"), new Formula1Racer("Mike"), new Formula1Racer("Tim"), new ChessPlayer("Peter"), new ChessPlayer("Max"), new ChessPlayer("Alex"), new FootballPlayer("Paul"), new FootballPlayer("Gare")};

    for (int i = 0; i < rooms.length; i++) {
      rooms[i] = new HotelRoom(i+1);
    }

    Hotel hotel = new Hotel(rooms);

    for (int i = 0; i < sportsmenToHotel.length; i++) {
      hotel.getRooms()[i].setPlace(sportsmenToHotel[i]);
    }

    for (int i = 0; i < hotel.getRooms().length; i++) {
      if (i < sportsmenToHotel.length){
        System.out.println("Info about user in the " + ( i + 1 ) + " room: "+ hotel.getRooms()[i].getPlace().getName() + " ::: "+ hotel.getRooms()[i].getPlace().getSport());
      }
      else {
        break;
      }
    }

    Sportsman[] sportsmenFromBusToHotel = {new Formula1Racer("Lee Shan"), new Formula1Racer("Ion Ju"), new Formula1Racer("Mi Kui"), new ChessPlayer("Pan Cho"), new ChessPlayer("Si Me Hi"), new ChessPlayer("Takishiba"), new FootballPlayer("Goi Y"), new FootballPlayer("De Lian")};


    BusPlace[] busPlace = new BusPlace[sportsmenFromBusToHotel.length];

      for (int i = 0; i < busPlace.length; i++) {
        busPlace[i] = new BusPlace(i+1);
      }

    for (int i = 0; i < sportsmenFromBusToHotel.length; i++) {
      busPlace[i].setPlace(sportsmenFromBusToHotel[i]);
    }

    for (BusPlace sp: busPlace
         ) {
        if(sp.getPlace() != null){
          System.out.println("Man in the bus " + sp.getPlace().getName());
        }
    }

    Bus bus = new Bus(busPlace);

    for (int i = 0; i < bus.getPlaces().length; i++) {
      System.out.println("Sportsman in the bus on the place " + (i+1) + " : " + bus.getPlaces()[i].getPlace().getName() + " " +bus.getPlaces()[i].getPlace().getSport());
    }

    int count = 0;
    for (int i = 0; i < rooms.length; i++) {
      if(rooms[i].getPlace() == null && bus.getPlaces().length-1 >= count){
        rooms[i].setPlace(bus.getPlaces()[count].getPlace());
        count++;
      }
    }

    for (HotelRoom room: rooms
         ) {
      if(room.getPlace() != null)
      System.out.println("In the room after bus " + room.getPlace().getName() + " " + room.getPlace().getSport());
    }

    System.out.println();
    System.out.println("In the hotel stay next sportsman:");

    Hotel LasPlaza = new Hotel(rooms);

//    for (int i = 0; i < LasPlaza.getRooms().length; i++) {
//      if(LasPlaza.getRooms()[i].getPlace().getName() != null){
//        System.out.println(LasPlaza.getRooms()[i].getPlace().getName());
//      } else {
//        break;
//      }
//    }

    System.out.println("-------------------------");

    Team[] arrOfTeam = {team, chessTeam};

    Championship championship = new Championship(arrOfTeam);
    championship.makeChampionship(chessTeam.getSportsmen()[0].getSport());

    championship.makeChampionship(team.getSportsmen()[0].getSport());
  }
}
