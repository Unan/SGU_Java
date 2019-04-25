package sgu.airport.service;

import sgu.airport.model.aircraft.flightVehicle.Airline;
import java.util.ArrayList;
import java.util.List;

public interface AirlineService {
    List<Airline> getAllAirlines();
    ArrayList<Airline> searchAirlines(int passengerSeats, double loadCapacity, double flightRange);
}
