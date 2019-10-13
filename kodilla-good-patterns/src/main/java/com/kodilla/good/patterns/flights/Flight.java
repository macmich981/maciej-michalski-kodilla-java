package com.kodilla.good.patterns.flights;

import java.util.Objects;

public final class Flight {
    private final String flightNumber;
    private final Airports departureAirport;
    private final Airports arrivalAirport;

    public Flight(final String flightNumber, final Airports departureAirport, final Airports arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) &&
                departureAirport == flight.departureAirport &&
                arrivalAirport == flight.arrivalAirport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}