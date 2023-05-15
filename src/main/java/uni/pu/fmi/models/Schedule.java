package uni.pu.fmi.models;

import java.util.*;

/**
 * 
 */
public class Schedule {

    private CinemaHall hall;

    /**
     * Default constructor
     */
    public Schedule() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public int movieId;

    /**
     * 
     */
    public int cinemaId;

    /**
     * 
     */
    private String startDateTime;

    /**
     * @return
     */
    public Movie getMovie() {
        // TODO implement here
        return null;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovie(Movie movie) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Cinema getCinema() {
        // TODO implement here
        return null;
    }

    /**
     * @param cinema 
     * @return
     */
    public void setCinema(Cinema cinema) {
        // TODO implement here
    }

    /**
     * @return
     */
    public CinemaHall getCinemaHall() {
        // TODO implement here
        return hall;
    }

    /**
     * @param hall 
     * @return
     */
    public void setCinemaHall(CinemaHall hall) {
        this.hall =hall;
    }

    /**
     * @return
     */
    public String getStartDateTime() {
        // TODO implement here
        return startDateTime;
    }

    /**
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        // TODO implement here
        this.startDateTime = startDateTime;
    }

}