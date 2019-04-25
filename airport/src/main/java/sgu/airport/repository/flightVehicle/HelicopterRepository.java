package sgu.airport.repository.flightVehicle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.flightVehicle.Helicopter;
import java.util.List;

@Repository
public interface HelicopterRepository extends CrudRepository<Helicopter, Integer> {

    List<Helicopter> getAllBy();
    List<Helicopter> getHelicoptersByPassengerSeatsGreaterThanAndLoadCapacityGreaterThanAndFlightRangeGreaterThan(int passengerSeats, double loadCapacity, double flightRange);
}
