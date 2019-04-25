package sgu.airport.model.aircraft.cargoAircraft;

import javax.persistence.Entity;

@Entity
public class Quadcopter extends CargoAircraft {

    public Quadcopter() {
    }

    public Quadcopter(String modelName,
                      double loadCapacity,
                      double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
