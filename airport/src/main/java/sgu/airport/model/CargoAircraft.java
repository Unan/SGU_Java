package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class CargoAircraft extends Aircraft {

    public CargoAircraft() {
    }

    public CargoAircraft(String modelName,
                         double loadCapacity,
                         double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
