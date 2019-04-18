package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class Quadcopter extends Aircraft {

    public Quadcopter(){}

    public Quadcopter(double loadCapacity, double flightRange) {
        super(loadCapacity, flightRange);
    }
}
