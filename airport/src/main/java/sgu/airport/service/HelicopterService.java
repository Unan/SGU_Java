package sgu.airport.service;

import sgu.airport.model.flightVehicle.Helicopter;

import java.util.ArrayList;
import java.util.List;

public interface HelicopterService {
    List<Helicopter> getAllHelicopters();
    ArrayList<Helicopter> searchHelicopters(int passengerSeats, double loadCapacity, double flightRange);
}
