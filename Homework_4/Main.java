package Homework_4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AirlineRezervationSystem airlineRezervationSystem=new AirlineRezervationSystem();
        Customer c1=new Customer("ali","cicel","05326354896","a@gmail.com");
        Customer c2=new Customer("kerem","cfd","2568963","b@gmail.com");
        Flight f1=new Flight(1,"A","B", new Date(),1);
        airlineRezervationSystem.addCustomer(c1);
        airlineRezervationSystem.addCustomer(c2);
        airlineRezervationSystem.addFlight(f1);


        airlineRezervationSystem.makeRez(c1,f1);
        airlineRezervationSystem.makeRez(c2,f1);
        airlineRezervationSystem.displayRez();
        airlineRezervationSystem.displayCustomers();
    }
}
    main bu da