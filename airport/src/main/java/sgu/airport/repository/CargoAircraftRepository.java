package sgu.airport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.aircraft.cargoAircraft.CargoAircraft;
import java.util.List;

@Repository
public interface CargoAircraftRepository extends CrudRepository<CargoAircraft, Integer> {

    List<CargoAircraft> getAllBy();
}
