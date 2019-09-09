package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String args[]) {
        try {
            Flight flight = new Flight("Heathrow", "Berlin");
            System.out.println(flight.getArrivalAirport() + ": " + new FlightFinder().findFlight(flight));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Koniec programu!");;
        }
    }
}
