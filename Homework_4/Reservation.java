package Homework_4;

import java.util.Date;

public class Reservation {
    private static int reservationCounter = 0;
    private int reservationNumber;
    private Date rezDate;
    private Flight flight;
    private Customer customer;
    private int size;

    public Reservation(Customer customer,Flight flight) {
        this.reservationCounter=reservationCounter;
        this.reservationNumber = reservationNumber;
        this.rezDate = rezDate;
        this.flight = flight;
        this.customer = customer;
        this.size=size;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Date getRezDate() {
        return rezDate;
    }

    public void setRezDate(Date rezDate) {
        this.rezDate = rezDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
