package sgu.airport.model.flightVehicle;

import sgu.airport.model.Aircraft;

import javax.persistence.*;

@MappedSuperclass
public abstract class FlightVehicle extends Aircraft {

    private int passengerSeats;

    public FlightVehicle() {}

    public FlightVehicle(double loadCapacity, double flightRange, int passengerSeats) {
        super(loadCapacity, flightRange);
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }
}
