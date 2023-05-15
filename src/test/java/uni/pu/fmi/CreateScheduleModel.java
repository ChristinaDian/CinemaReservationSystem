package uni.pu.fmi;

import uni.pu.fmi.controllers.CreateScheduleController;

public class CreateScheduleModel {
    private String cinema;
    private String movie;
    private String startTime;
    private String hall;
    private String message;
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
    public String getHall() {
        return hall;
    }

    public void addHall(String hall) {
        this.hall = hall;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void clickButton() {
        CreateScheduleController scheduleController= new CreateScheduleController();
        message = scheduleController.schedule(cinema, movie, startTime, hall);
    }

}
