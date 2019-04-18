package sgu.airport.model.flightVehicle;

import javax.persistence.Entity;

@Entity
public class Helicopter extends FlightVehicle {

    public Helicopter(){}

    public Helicopter(double loadCapacity, double flightRange, int seatsNumber) {
        super(loadCapacity, flightRange, seatsNumber);
    }
}
