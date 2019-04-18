package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class CargoAircraft extends Aircraft {

    public CargoAircraft(){}

    public CargoAircraft(double loadCapacity, double flightRange) {
        super(loadCapacity, flightRange);
    }
}
