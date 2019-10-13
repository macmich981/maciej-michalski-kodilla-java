package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightProcessor {
    private final Set<Flight> currentFlights = new FlightRetriever().retrieve();

    public List<Flight> departureAirportSearch (Airports selectedAirport) {

        return currentFlights.stream()
        .filter(flight -> flight.getDepartureAirport().equals(selectedAirport))
        .collect(Collectors.toList());
    }

    public List<Flight> arrivalAirportSearch (Airports selectedAirport) {

        return currentFlights.stream()
        .filter(flight -> flight.getArrivalAirport().equals(selectedAirport))
        .collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch (Airports departureAirport, Airports arrivalAirport) {
        List<Flight> flightsFromDestination = departureAirportSearch(departureAirport);

        return flightsFromDestination.stream()
        .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
        .collect(Collectors.toList());
    }

    public void connectedFlightSearch(Airports departureFrom, Airports arrivalTo) {

        Set<Flight> list1 = currentFlights.stream()
        .filter(flight -> flight.getDepartureAirport().equals(departureFrom))
        .collect(Collectors.toSet());

        Set<Flight> list2 = currentFlights.stream()
        .filter(flight -> flight.getArrivalAirport().equals(arrivalTo))
        .collect(Collectors.toSet());

        for (Flight flight1 : list1) {
            for (Flight flight2 : list2) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}