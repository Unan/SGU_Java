package sgu.airport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgu.airport.model.Quadcopter;
import java.util.List;

@Repository
public interface QuadcopterRepository extends CrudRepository<Quadcopter, Integer> {

    List<Quadcopter> getAllBy();
}
