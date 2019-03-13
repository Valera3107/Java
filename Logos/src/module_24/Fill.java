package module_24;

import java.util.*;

public class Fill {
  public static void fillCinemaList( List<Cinema> cinemaList) throws TimeException {
    SortedSet<Movie> moviesList1 = new TreeSet<>();
    moviesList1.add(new Movie("Iron Man", new Time(2, 30), 8));
    moviesList1.add(new Movie("Iron Man 2", new Time(1, 30), 3));
    moviesList1.add(new Movie("Iron Man 3", new Time(1, 43), 5));
    moviesList1.add(new Movie("Avengers", new Time(2, 23), 1));
    moviesList1.add(new Movie("In the sea", new Time(1, 35), 9));
    moviesList1.add(new Movie("Alien", new Time(2, 54), 10));
    moviesList1.add(new Movie("Mr. Cat", new Time(1, 12),8));

    SortedSet<Movie> moviesList2 = new TreeSet<>();
    moviesList2.add(new Movie("Independents day", new Time(2, 45), 7));
    moviesList2.add(new Movie("Batman", new Time(2, 59), 3));
    moviesList2.add(new Movie("U.S.A.", new Time(3, 43), 9));
    moviesList2.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList2.add(new Movie("In the sea", new Time(1, 35), 3));
    moviesList2.add(new Movie("Fat Dog", new Time(1, 18), 6));
    moviesList2.add(new Movie("Mr. Cat", new Time(1, 12), 4));

    SortedSet<Movie> moviesList3 = new TreeSet<>();
    moviesList3.add(new Movie("Tim", new Time(1, 45), 4));
    moviesList3.add(new Movie("Iron Man 2", new Time(1, 30), 3));
    moviesList3.add(new Movie("Iron Man 3", new Time(1, 43), 5));
    moviesList3.add(new Movie("Avengers", new Time(2, 23), 1));
    moviesList3.add(new Movie("In the sea", new Time(1, 35), 9));
    moviesList3.add(new Movie("Independents day", new Time(2, 45), 7));
    moviesList3.add(new Movie("Batman", new Time(2, 59), 3));

    SortedSet<Movie> moviesList4 = new TreeSet<>();
    moviesList4.add(new Movie("Fat Dog", new Time(1, 18), 6));
    moviesList4.add(new Movie("Mr. Cat", new Time(1, 12), 4));
    moviesList4.add(new Movie("U.S.A.", new Time(3, 43), 9));
    moviesList4.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList4.add(new Movie("U.S.A.", new Time(3, 43), 9));
    moviesList4.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList4.add(new Movie("In the sea", new Time(1, 35), 3));

    SortedSet<Movie> moviesList5 = new TreeSet<>();
    moviesList5.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList5.add(new Movie("In the sea", new Time(1, 35), 3));
    moviesList5.add(new Movie("Fat Dog", new Time(1, 18), 6));
    moviesList5.add(new Movie("Mr. Cat", new Time(1, 12), 4));
    moviesList5.add(new Movie("U.S.A.", new Time(3, 43), 9));
    moviesList5.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList5.add(new Movie("U.S.A.", new Time(3, 43), 9));

    SortedSet<Movie> moviesList6 = new TreeSet<>();
    moviesList6.add(new Movie("Mr. Cat", new Time(1, 12), 4));
    moviesList6.add(new Movie("U.S.A.", new Time(3, 43), 9));
    moviesList6.add(new Movie("Avengers", new Time(2, 23),5));
    moviesList6.add(new Movie("Iron Man 2", new Time(1, 30), 3));
    moviesList6.add(new Movie("Iron Man 3", new Time(1, 43), 5));
    moviesList6.add(new Movie("Avengers", new Time(2, 23), 1));
    moviesList6.add(new Movie("In the sea", new Time(1, 35), 9));

    Seance seanceMon = new Seance(moviesList1);
    Seance seanceTh = new Seance(moviesList2);
    Seance seanceWed = new Seance(moviesList3);
    Seance seanceThr = new Seance(moviesList4);
    Seance seanceFr = new Seance(moviesList5);
    Seance seanceSat = new Seance(moviesList6);
    Seance seanceSun = new Seance(moviesList3);

    cinemaList.add(new Cinema("Karavan", new Time(6, 20), new Time(24, 0)));
    cinemaList.add(new Cinema("Daffi", new Time(7, 0), new Time(23, 59)));
    cinemaList.add(new Cinema("Most", new Time(6, 20), new Time(23, 30)));

    cinemaList.get(0).addSeance(Days.MONDAY, seanceMon);
    cinemaList.get(0).addSeance(Days.THUESDAY, seanceTh);
    cinemaList.get(0).addSeance(Days.WEDNESDAY, seanceWed);
    cinemaList.get(0).addSeance(Days.THUESDAY, seanceThr);
    cinemaList.get(0).addSeance(Days.FRIDAY, seanceFr);
    cinemaList.get(0).addSeance(Days.SATURDAY, seanceSat);
    cinemaList.get(0).addSeance(Days.SUNDAY, seanceSun);

    cinemaList.get(1).addSeance(Days.MONDAY, seanceWed);
    cinemaList.get(1).addSeance(Days.THUESDAY, seanceFr);
    cinemaList.get(1).addSeance(Days.WEDNESDAY,seanceThr );
    cinemaList.get(1).addSeance(Days.THUESDAY, seanceSun);
    cinemaList.get(1).addSeance(Days.FRIDAY, seanceFr);
    cinemaList.get(1).addSeance(Days.SATURDAY, seanceSat);
    cinemaList.get(1).addSeance(Days.SUNDAY, seanceMon);

    cinemaList.get(2).addSeance(Days.MONDAY, seanceSun);
    cinemaList.get(2).addSeance(Days.THUESDAY, seanceWed);
    cinemaList.get(2).addSeance(Days.WEDNESDAY, seanceSat);
    cinemaList.get(2).addSeance(Days.THUESDAY, seanceSat);
    cinemaList.get(2).addSeance(Days.FRIDAY, seanceFr);
    cinemaList.get(2).addSeance(Days.SATURDAY, seanceSat);
    cinemaList.get(2).addSeance(Days.SUNDAY, seanceFr);
  }
}
