package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightRetriever {
    public Set retrieve() {
        Set<Flight> flights = new HashSet<>();

        flights.add(new Flight("ACD543", Airports.PL_KRK, Airports.PL_WRO));
        flights.add(new Flight("BZS321", Airports.PL_KRK, Airports.PL_POZ));
        flights.add(new Flight("FGT987", Airports.PL_KRK, Airports.PL_GDA));
        flights.add(new Flight("UTR664", Airports.PL_KRK, Airports.PL_WAR));
        flights.add(new Flight("BQW432", Airports.PL_KRK, Airports.PL_POZ));
        flights.add(new Flight("DWR456", Airports.PL_KRK, Airports.PL_GDA));
        flights.add(new Flight("QWR123", Airports.PL_KRK, Airports.PL_POZ));

        flights.add(new Flight("HTY478", Airports.PL_WAR, Airports.PL_GDA));
        flights.add(new Flight("KYC638", Airports.PL_WAR, Airports.PL_POZ));
        flights.add(new Flight("NOP750", Airports.PL_WAR, Airports.PL_KRK));
        flights.add(new Flight("FNP058", Airports.PL_WAR, Airports.PL_WRO));
        flights.add(new Flight("DPT730", Airports.PL_WAR, Airports.PL_KRK));
        flights.add(new Flight("PDB907", Airports.PL_WAR, Airports.PL_GDA));
        flights.add(new Flight("DNU585", Airports.PL_WAR, Airports.PL_POZ));

        flights.add(new Flight("KJG754", Airports.PL_WRO, Airports.PL_GDA));
        flights.add(new Flight("LDW296", Airports.PL_WRO, Airports.PL_POZ));
        flights.add(new Flight("OGN895", Airports.PL_WRO, Airports.PL_KRK));
        flights.add(new Flight("FTI984", Airports.PL_WRO, Airports.PL_WRO));
        flights.add(new Flight("GTT654", Airports.PL_WRO, Airports.PL_KRK));
        flights.add(new Flight("POL987", Airports.PL_WRO, Airports.PL_GDA));
        flights.add(new Flight("UTU765", Airports.PL_WRO, Airports.PL_POZ));

        return flights;
    }
}