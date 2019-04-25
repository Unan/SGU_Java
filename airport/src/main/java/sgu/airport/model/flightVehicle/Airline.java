package sgu.airport.model.flightVehicle;

import javax.persistence.Entity;

@Entity
public class Airline extends FlightVehicle {

    public Airline() {
    }

    public Airline(String modelName,
                   double loadCapacity,
                   double flightRange,
                   int seatsNumber
    ) {
        super(modelName, loadCapacity, flightRange, seatsNumber);
    }

}
