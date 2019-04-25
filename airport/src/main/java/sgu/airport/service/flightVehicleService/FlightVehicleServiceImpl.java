package sgu.airport.service.flightVehicleService;

import org.springframework.stereotype.Service;
import sgu.airport.model.aircraft.flightVehicle.FlightVehicle;
import sgu.airport.repository.flightVehicle.AirlineRepository;
import sgu.airport.repository.flightVehicle.HelicopterRepository;

@Service
public class FlightVehicleServiceImpl implements FlightVehicleService {

    private final AirlineRepository airlineRepository;
    private final HelicopterRepository helicopterRepository;

    public FlightVehicleServiceImpl(AirlineRepository airlineRepository, HelicopterRepository helicopterRepository) {
        this.airlineRepository = airlineRepository;
        this.helicopterRepository = helicopterRepository;
    }

    @Override
    public int getTotalPassengerSeats() {
        int count = 0;
        for (FlightVehicle flightVehicle : airlineRepository.getAllBy()){
            count += flightVehicle.getPassengerSeats();
        }
        for (FlightVehicle flightVehicle : helicopterRepository.getAllBy()){
            count += flightVehicle.getPassengerSeats();
        }
        return count;
    }
}
