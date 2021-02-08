package com.kodilla.good.patterns.flight;

public class Flight {
    private final String departure;
    private final String arrival;
    private final int flightNumber;

    public Flight(String departure, String arrival, int flightNumber) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        return arrival != null ? arrival.equals(flight.arrival) : flight.arrival == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + flightNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
