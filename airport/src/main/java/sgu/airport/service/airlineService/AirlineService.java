package sgu.airport.service.airlineService;

import sgu.airport.model.aircraft.flightVehicle.Airline;
import sgu.airport.service.aircraftService.AircraftService;

import java.util.ArrayList;
import java.util.List;

public interface AirlineService {
    List<Airline> getAllAirlines();
    ArrayList<Airline> searchAirlines(int passengerSeats, double loadCapacity, double flightRange);
}
