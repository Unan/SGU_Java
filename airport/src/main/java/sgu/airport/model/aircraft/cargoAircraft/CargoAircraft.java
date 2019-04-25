package sgu.airport.model.aircraft.cargoAircraft;

import sgu.airport.model.aircraft.Aircraft;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CargoAircraft extends Aircraft {

    public CargoAircraft() {
    }

    public CargoAircraft(String modelName,
                         double loadCapacity,
                         double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
