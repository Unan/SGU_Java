package sgu.airport.service.aircraftService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sgu.airport.model.aircraft.Aircraft;
import sgu.airport.repository.flightVehicle.AirlineRepository;
import sgu.airport.repository.flightVehicle.HelicopterRepository;

@Service
public class AircraftServiceImpl implements AircraftService {

    private final AirlineRepository airlineRepository;
    private final HelicopterRepository helicopterRepository;

    @Autowired
    public AircraftServiceImpl(AirlineRepository airlineRepository, HelicopterRepository helicopterRepository) {
        this.airlineRepository = airlineRepository;
        this.helicopterRepository = helicopterRepository;
    }
    @Override
    public double getTotalLoadCapacity() {
        double count = 0;
        for (Aircraft aircraft : airlineRepository.getAllBy()){
            count += aircraft.getLoadCapacity();
        }
        for (Aircraft aircraft : helicopterRepository.getAllBy()){
            count += aircraft.getLoadCapacity();
        }
        return count;
    }
}
