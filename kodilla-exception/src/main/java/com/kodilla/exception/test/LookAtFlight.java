package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class LookAtFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = initFlights();

        if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println(flight.getArrivalAirport() + ": " + flights.get(flight.getArrivalAirport()));
        } else {
            throw new RouteNotFoundException();
        }
    }

    private Map<String, Boolean> initFlights() {
        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Heathrow", true);
        flights.put("Lotnisko Chopina", false);
        flights.put("Moskwa-Szeremietiewo", true);
        flights.put("Johannesburg", false);
        flights.put("Nowy Jork-JFK", true);

        return flights;
    }
}
