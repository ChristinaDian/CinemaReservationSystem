package uni.pu.fmi;

import uni.pu.fmi.controllers.ReservationController;

public class ReservationModel {
    private String username;
    private String cinema;
    private String movie;
    private String startTime;
    private String timeOfReservation;
    private int row;
    private int num;
    private String message;

    public String getUsername() {
        return username;
    }

    public void addUsername(String username) {
        this.username = username;
    }

    public String getCinema() {
        return cinema;
    }

    public void addCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getMovie() {
        return movie;
    }

    public void addMovie(String movie) {
        this.movie = movie;
    }

    public String getStartTime() {
        return startTime;
    }

    public void addStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTimeOfReservation() {
        return timeOfReservation;
    }

    public void addTimeOfReservation(String timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public int getRow() {
        return row;
    }

    public void addRow(int row) {
        this.row = row;
    }

    public int getNum() {
        return num;
    }

    public void addNum(int num) {
        this.num = num;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void clickButton() {
        ReservationController reservationController = new ReservationController();
        message = reservationController.reservation(username, cinema, movie, startTime, timeOfReservation, row, num);
    }
}
