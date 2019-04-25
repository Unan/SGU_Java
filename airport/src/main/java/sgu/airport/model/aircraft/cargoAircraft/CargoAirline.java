package sgu.airport.model.aircraft.cargoAircraft;

import javax.persistence.Entity;

@Entity
public class CargoAirline extends CargoAircraft {

    public CargoAirline() {
    }

    public CargoAirline(String modelName,
                         double loadCapacity,
                         double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
