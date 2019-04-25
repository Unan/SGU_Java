package sgu.airport.model.aircraft.cargoAircraft;

import javax.persistence.Entity;

@Entity
public class CargoHelicopter extends CargoAircraft {

    public CargoHelicopter() {
    }

    public CargoHelicopter(String modelName,
                           double loadCapacity,
                           double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
