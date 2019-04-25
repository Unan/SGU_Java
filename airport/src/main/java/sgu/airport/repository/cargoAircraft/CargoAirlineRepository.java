package sgu.airport.repository.cargoAircraft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.aircraft.cargoAircraft.CargoAirline;
import java.util.List;

@Repository
public interface CargoAirlineRepository extends CrudRepository<CargoAirline, Integer> {

    List<CargoAirline> getAllBy();
}
