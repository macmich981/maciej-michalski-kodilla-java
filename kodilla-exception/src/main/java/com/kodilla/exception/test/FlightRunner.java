package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String args[]) {
        try {
            new LookAtFlight().findFlight(new Flight("Heathrow", "Berlin"));
        } catch (RouteNotFoundException e) {
            System.out.println("Błąd: brak połączeń z tym lotniskiem: " + e);
        } finally {
            System.out.println("Po bloku \"try - catch\"");
        }
        System.out.println("Koniec programu!");
    }
}
