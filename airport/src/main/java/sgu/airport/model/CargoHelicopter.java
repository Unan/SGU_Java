package sgu.airport.model;

import javax.persistence.Entity;

@Entity
public class CargoHelicopter extends Aircraft{

    public CargoHelicopter(){}

    public CargoHelicopter(double loadCapacity, double flightRange) {
        super(loadCapacity, flightRange);
    }
}
