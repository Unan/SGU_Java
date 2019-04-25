package sgu.airport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.aircraft.cargoAircraft.CargoHelicopter;
import java.util.List;

@Repository
public interface CargoHelicopterRepository extends CrudRepository<CargoHelicopter, Integer> {

    List<CargoHelicopter> getAllBy();
}
