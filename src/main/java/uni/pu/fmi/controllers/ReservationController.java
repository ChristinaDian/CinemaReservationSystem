package uni.pu.fmi.controllers;

import org.apache.commons.lang3.StringUtils;
import uni.pu.fmi.DB;
import uni.pu.fmi.models.ReservedSeats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class ReservationController {
    Date startTime;
    Date timeOfReservation;

    public String reservation(String username,
                              String cinema,
                              String movie,
                              String startTime,
                              String timeOfReservation,
                              int row,
                              int num) {

        if (StringUtils.isBlank(cinema)) {
            return "Не сте избрали кино!";
        }
        if (StringUtils.isBlank(movie)) {
            return "Не сте избрали филм!";
        }
        if (isPlaceReservedMethod(row, num)) {
            return "Мястото е заето!";
        }
        if (!checkDates(startTime, timeOfReservation)) {
            return "Резервацията трябва да е поне 60 минути преди началото на прожекцията!";
        }
        return "Успешно направихте резервация!";
    }

    private boolean isPlaceReservedMethod(int row, int num) {
        Collection<ReservedSeats> seats = new DB().getReservedSeatsDB().values();
        for (ReservedSeats seat : seats) {
            if (seat.getRow() == row && seat.getNum() == num) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDates(String startTime, String timeOfReservation) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            this.startTime = formatter.parse(startTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        try {
            this.timeOfReservation = formatter.parse(timeOfReservation);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long difference_In_Minutes
                = ((this.startTime.getTime() - this.timeOfReservation.getTime())
                / (1000 * 60));
        return difference_In_Minutes > 60;
    }
}
