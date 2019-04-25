package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class Quadcopter extends Aircraft {

    public Quadcopter() {
    }

    public Quadcopter(String modelName,
                      double loadCapacity,
                      double flightRange
    ) {
        super(modelName, loadCapacity, flightRange);
    }
}
