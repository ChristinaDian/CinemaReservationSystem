package uni.pu.fmi.models;

import java.util.*;

/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public int userId;

    /**
     * 
     */
    public int cinemaId;

    /**
     * @return
     */
    private String username;

    /**
     *
     */
    public String getUsername() {
        // TODO implement here
        return "";
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Schedule getSchedule() {
        // TODO implement here
        return null;
    }

    /**
     * @param schedule 
     * @return
     */
    public void setSchedule(Schedule schedule) {
        // TODO implement here
    }

    /**
     * @return
     */
    public TicketType getTicketType() {
        // TODO implement here
        return null;
    }

    /**
     * @param ticketType 
     * @return
     */
    public void setTicketType(TicketType ticketType) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set<ReservedSeats> getReservedSeats() {
        // TODO implement here
        return null;
    }

    /**
     * @param reservedSeats
     */
    public void setReservedSeats(Set<ReservedSeats> reservedSeats) {
        // TODO implement here
    }

}