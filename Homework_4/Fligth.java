package Homework_4;

import java.util.Date;

public class Flight {
    private int flightId;
    private String departure;
    private String destination;
    private Date date;
    private int capacity;




    public Flight(int flightId, String departure, String destination, Date date, int capacity) {
        this.flightId = flightId;
        this.departure = departure;
        this.destination = destination;
        this.date=date;
        this.capacity = capacity;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
