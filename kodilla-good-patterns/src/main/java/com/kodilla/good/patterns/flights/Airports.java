package com.kodilla.good.patterns.flights;

public enum Airports {
    PL_KRK("Port Lotniczy - Kraków"),
    PL_WRO("Port Lotniczy - Wrocław"),
    PL_POZ("Port Lotniczy - Poznań"),
    PL_WAR("Port Lotniczy - Warszawa"),
    PL_GDA("Port Lotniczy - Gdańsk");

    private final String airportName;

    Airports(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return airportName;
    }
}