package sgu.airport.repository.flightVehicle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.flightVehicle.Airline;
import java.util.List;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Integer> {

    List<Airline> getAllBy();
}
