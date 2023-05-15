package uni.pu.fmi.models;

import java.util.*;

/**
 * 
 */
public class ReservedSeats {

    /**
     * Default constructor
     */
    public ReservedSeats() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public int hallId;

    /**
     * 
     */
    public int sheduleId;

    /**
     * 
     */
    private int seatRow;

    /**
     * 
     */
    private int seatNum;

    /**
     * @return
     */
    public int getNum() {
        // TODO implement here
        return seatNum;
    }

    /**
     * @param row
     */
    public void setRow(int row) {
        // TODO implement here
        this.seatRow=row;
    }

    /**
     * @return
     */
    public int getRow() {
        // TODO implement here
        return seatRow;
    }

    /**
     * @param num
     */
    public void setNum(int num) {
        // TODO implement here
        this.seatNum=num;
    }

}