package sgu.airport.model.flightVehicle;

import javax.persistence.Entity;

@Entity
public class Helicopter extends FlightVehicle {

    public Helicopter() {
    }

    public Helicopter(String modelName,
                      double loadCapacity,
                      double flightRange,
                      int seatsNumber
    ) {
        super(modelName, loadCapacity, flightRange, seatsNumber);
    }
}
