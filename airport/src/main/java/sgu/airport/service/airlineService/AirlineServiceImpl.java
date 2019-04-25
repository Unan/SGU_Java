package sgu.airport.service.airlineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sgu.airport.model.aircraft.flightVehicle.Airline;
import sgu.airport.repository.flightVehicle.AirlineRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepository airlineRepository;

    @Autowired
    public AirlineServiceImpl(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.getAllBy();
    }

    @Override
    public ArrayList<Airline> searchAirlines(int passengerSeats, double loadCapacity, double flightRange) {
        return new ArrayList<>(airlineRepository.getAirlinesByPassengerSeatsGreaterThanAndLoadCapacityGreaterThanAndFlightRangeGreaterThan(passengerSeats, loadCapacity, flightRange));
    }
}
