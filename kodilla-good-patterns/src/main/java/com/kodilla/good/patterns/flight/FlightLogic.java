package com.kodilla.good.patterns.flight;

import java.util.*;

public class FlightLogic {
    private final List<Flight> connections;

    public FlightLogic(List<Flight> connections) {
        this.connections = connections;
    }

    public FlightLogic(Flight flight) {
        this.connections = new ArrayList<>();
        this.connections.add(flight);
    }

    public List<Flight> getConnections() {
        return connections;
    }
}
