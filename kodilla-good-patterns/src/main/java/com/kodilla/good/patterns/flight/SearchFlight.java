package com.kodilla.good.patterns.flight;

import java.util.*;
import java.util.stream.Collectors;

public class SearchFlight {
    private Set<Flight> flightsSet;

    public SearchFlight(Set<Flight> flightsSet) {
        this.flightsSet = flightsSet;
    }

    //z miasta
    public List<FlightLogic> searchFlightsDeparture(String departure) {
        return flightsSet.stream()
                .filter(d -> d.getDeparture().equals(departure))
                .map(flight -> new FlightLogic(flight))
                .collect(Collectors.toList());
    }
    //do miasta
    public List<FlightLogic> searchFlightsArrival(String arrival) {
        return flightsSet.stream()
                .filter(a -> a.getDeparture().equals(arrival))
                .map(flight -> new FlightLogic(flight))
                .collect(Collectors.toList());
    }

    //lot z przesiadka np Wwa -> waszyngton, ww->berlin,berlin->waszyngton (miasto startowe i koncowe -> petla w petli, wyszukac loty z warszawy, wszystkie loty konczace sie w waszyngtonie i 2 sety jesli lotnisto 1 = lotnisko 2 to mamy pare)


}


