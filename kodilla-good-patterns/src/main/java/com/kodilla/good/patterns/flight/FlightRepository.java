package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {
    public Set<Flight> getAllFlights() {
        Set<Flight> allFlights = new HashSet<>();
        allFlights.add(new Flight("Wroclaw", "Warszawa", 1));
        allFlights.add(new Flight("Wroclaw", "Katowice", 21));
        allFlights.add(new Flight("Wroclaw", "Poznan", 5));
        allFlights.add(new Flight("Wroclaw", "Krakow", 3));
        allFlights.add(new Flight("Wroclaw", "Gdansk", 16));
        allFlights.add(new Flight("Krakow", "Warszawa", 2));
        allFlights.add(new Flight("Krakow", "Katowice", 36));
        allFlights.add(new Flight("Krakow", "Wroclaw", 3));
        allFlights.add(new Flight("Krakow", "Poznan", 12));
        allFlights.add(new Flight("Krakow", "Gdansk", 14));
        return allFlights;
    }
}
