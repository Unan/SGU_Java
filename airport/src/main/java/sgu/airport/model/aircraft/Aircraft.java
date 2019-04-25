package sgu.airport.model.aircraft;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String modelName;

    private double loadCapacity;

    private double flightRange;

    public Aircraft() {
    }

    public Aircraft(String modelName,
                    double loadCapacity,
                    double flightRange
    ) {
        this.modelName = modelName;
        this.loadCapacity = loadCapacity;
        this.flightRange = flightRange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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
