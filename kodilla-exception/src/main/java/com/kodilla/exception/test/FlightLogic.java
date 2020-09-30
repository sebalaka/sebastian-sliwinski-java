package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> aiport = new HashMap<>();
        aiport.put("Pszczyna",false);
        aiport.put("Saloniki",true);
        aiport.put("Malmoe",false);
        aiport.put("London",true);
        aiport.put("Bejing",true);
        aiport.put("Baku",false);

        if (aiport.containsKey(flight.getDepartureAirport())) {
            System.out.println("test");
        } else {
            throw new RouteNotFoundException("test2");
        }
    }

    public static void main(String[] args) {
        Flight SalonikiLondon = new Flight("Saloniki", "London"); //tt
        Flight SalonikiPszczyna = new Flight("Saloniki", "Pszczyna"); //tf
        Flight MalmoeBejing = new Flight("Malmoe", "Bejing"); //ft
        Flight PszczynaBaku = new Flight("Pszczyna", "Baku"); //ff

        try {
            FlightLogic flightLogic = new FlightLogic();
            flightLogic.findFilght(SalonikiLondon);
            System.out.println("kurczak");

        } catch (RouteNotFoundException e) {
            System.out.println("test" + e);
        } finally {
            System.out.println("-------------");
        }

//        Flight test = new Flight(MalmoeBejing.departureAirport, MalmoeBejing.arrivalAirport);

//        System.out.println(SalonikiLondon.getDepartureAirport());
//        System.out.println(SalonikiLondon.getArrivalAirport());

//        try {
//            FlightLogic flightLogic = new FlightLogic();
//            flightLogic.findFilght(test);
//            System.out.println("kurczak");
//        } catch (RouteNotFoundException e) {
//            System.out.println("test" + e);
//        } finally {
//            System.out.println("-------------");
//        }




        try {
            FlightLogic flightLogic = new FlightLogic();
            flightLogic.findFilght(SalonikiPszczyna);
            System.out.println("kurczak");
        } catch (RouteNotFoundException e) {
            System.out.println("test" + e);
        } finally {
            System.out.println("-------------");
        }

        try {
            FlightLogic flightLogic = new FlightLogic();
            flightLogic.findFilght(MalmoeBejing);
            System.out.println("kurczak");
        } catch (RouteNotFoundException e) {
            System.out.println("test" + e);
        } finally {
            System.out.println("-------------");
        }

        try {
            FlightLogic flightLogic = new FlightLogic();
            flightLogic.findFilght(PszczynaBaku);
            System.out.println("kurczak");
        } catch (RouteNotFoundException e) {
            System.out.println("test" + e);
        } finally {
            System.out.println("-------------");
        }

    }
}
