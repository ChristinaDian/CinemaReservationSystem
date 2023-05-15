package uni.pu.fmi.controllers;

import uni.pu.fmi.DB;
import uni.pu.fmi.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CreateScheduleController {
    Date startTime;
    public String schedule(String cinema, String movie, String startTime, String hall) {
        Map<String, Cinema> cinemasDB = new DB().getCinemasDB();
        if (!cinemasDB.containsKey(cinema)) {
            return "Избрали сте несъществуващо кино!";
        }
        Map<String, Movie> moviesDB = new DB().getMoviesDB();
        if (!moviesDB.containsKey(movie)) {
            return "Избрали сте несъществуващ филм!";
        }
        if (isHallBusy(hall, startTime)) {
            return "Залата е заета!";
        }
        if(!compareDates(startTime)){
            return "Не може да изберете дата, която е минала!";
        }
        return "Успешно създадохте прожекция!";

    }
    private boolean compareDates (String startTime) {
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            this.startTime = formatter.parse(startTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String now;
        now = formatter.format(Calendar.getInstance().getTime());
        Date localTime;
        try {
            localTime = formatter.parse(now);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        int result = this.startTime.compareTo(localTime);

        return result>0;
    }
    private boolean isHallBusy(String hall, String startTime) {
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date parsedDate;
        try {
            parsedDate = formatter.parse(startTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Collection<Schedule> schedules = new DB().getSchedulesDB().values();
        for (Schedule schedule:  schedules) {
            Date time;
            try {
                time = formatter.parse(schedule.getStartDateTime());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if(time.compareTo(parsedDate)==0 && Objects.equals(schedule.getCinemaHall().getName(), hall)){
                return true;
            }
        }return false;
    }
}
