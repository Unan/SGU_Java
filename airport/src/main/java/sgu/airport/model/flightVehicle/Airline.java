package sgu.airport.model.flightVehicle;

import javax.persistence.Entity;

@Entity
public class Airline extends FlightVehicle {

    public Airline(){}

    public Airline(double loadCapacity, double flightRange, int seatsNumber) {
        super(loadCapacity, flightRange, seatsNumber);
    }

}
