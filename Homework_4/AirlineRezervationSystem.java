package Homework_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineRezervationSystem {
    private List<Customer> customers=new ArrayList<>();
    private List<Flight> flights=new ArrayList<>();
    private List<Reservation> rezervations=new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void makeRez(Customer customer,Flight flight){
        Reservation rezervation=new Reservation(customer,flight);
        if (flight.getCapacity() > rezervations.size()){
            rezervation.setCustomer(customer);
            rezervation.setFlight(flight);
            rezervation.setRezDate(new Date());
            this.rezervations.add(rezervation);
            System.out.println("Reservation made success");
            System.out.println("Reservation number: "+rezervation.getReservationNumber()+1);}
        else {
            System.out.println("Flight is full. Reservation cannot be made.");
        }

    }
    public void displayCustomers() {
        System.out.println("All customers:");
        for (Customer customer : customers) {
            System.out.println(customer.getfName() + " " + customer.getlName());
        }
    }

    public void displayRez(){
        System.out.println("All reservations:");
        for (Reservation res: rezervations){
            System.out.println("Reservation number: "+(rezervations.size()+1)+
                    "Reservation name "+res.getCustomer().getfName()+" "+res.getCustomer().getlName()+" "+
                    "Reservation Flight: "+res.getFlight().getFlightId() );

        }
    }

}

