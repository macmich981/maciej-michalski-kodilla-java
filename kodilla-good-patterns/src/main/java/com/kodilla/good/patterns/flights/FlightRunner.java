package com.kodilla.good.patterns.flights;

public class FlightRunner {
    public static void main(String[] args) {
        FlightProcessor flightProcessor = new FlightProcessor();

        System.out.println(flightProcessor.departureAirportSearch(Airports.PL_KRK));
        System.out.println(flightProcessor.arrivalAirportSearch(Airports.PL_POZ));
        System.out.println(flightProcessor.directFlightSearch(Airports.PL_WAR, Airports.PL_WRO));
        flightProcessor.connectedFlightSearch(Airports.PL_WAR, Airports.PL_KRK);
    }
}