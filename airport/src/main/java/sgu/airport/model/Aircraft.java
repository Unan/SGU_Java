package sgu.airport.model;

import sgu.airport.model.flightVehicle.Airline;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double loadCapacity;

    private double flightRange;

    public Aircraft(){}

    public Aircraft(double loadCapacity, double flightRange) {
        this.loadCapacity = loadCapacity;
        this.flightRange = flightRange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }
}
