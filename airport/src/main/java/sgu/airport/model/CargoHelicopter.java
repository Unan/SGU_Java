package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class CargoHelicopter extends Aircraft {

    public CargoHelicopter() {
    }

    public CargoHelicopter(String modelName,
                           double loadCapacity,
                           double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
