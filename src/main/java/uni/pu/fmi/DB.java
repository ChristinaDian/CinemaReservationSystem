package uni.pu.fmi;

import uni.pu.fmi.models.*;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private Map<Integer, ReservedSeats> reservedSeats = new HashMap<>();
    private Map<String, Cinema> cinemas = new HashMap<>();
    private Map<String, Movie> movies = new HashMap<>();
    private Map<String, CinemaHall> halls = new HashMap<>();
    private Map<String, Schedule> schedules = new HashMap<>();
    public DB() {
        ReservedSeats reservedSeat1 = new ReservedSeats();
        reservedSeat1.setRow(1);
        reservedSeat1.setNum(1);
        reservedSeats.put(1, reservedSeat1);

        ReservedSeats reservedSeat2 = new ReservedSeats();
        reservedSeat2.setRow(1);
        reservedSeat2.setNum(2);
        reservedSeats.put(2, reservedSeat2);

        Cinema cinema1 = new Cinema();
        cinema1.setName("cinemaCity");
        cinemas.put("cinemaCity", cinema1);

        Movie movie1 = new Movie();
        movie1.setTitle("SpiderMan");
        movies.put("SpiderMan", movie1);

        CinemaHall cinemaHall =new CinemaHall();
        cinemaHall.setName("VIP");
        halls.put("VIP", cinemaHall);

        Schedule schedule1 = new Schedule();
        schedule1.setCinemaHall(cinemaHall);
        schedule1.setStartDateTime("17-05-2023 15:00:00");
        schedules.put("1",schedule1);
    }

    public Map<Integer, ReservedSeats> getReservedSeatsDB() {
        return reservedSeats;
    }
    public Map<String, Cinema> getCinemasDB() {
        return cinemas;
    }
    public Map<String, Movie> getMoviesDB() {
        return movies;
    }
    public Map<String, Schedule> getSchedulesDB() {
        return schedules;
    }
}
