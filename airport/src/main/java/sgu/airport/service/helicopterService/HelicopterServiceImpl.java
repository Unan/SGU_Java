package sgu.airport.service.helicopterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sgu.airport.model.aircraft.flightVehicle.Helicopter;
import sgu.airport.repository.flightVehicle.HelicopterRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelicopterServiceImpl implements HelicopterService {

    private final HelicopterRepository helicopterRepository;

    @Autowired
    public HelicopterServiceImpl(HelicopterRepository helicopterRepository) {
        this.helicopterRepository = helicopterRepository;
    }

    @Override
    public List<Helicopter> getAllHelicopters(){
        return helicopterRepository.getAllBy();
    }

    @Override
    public ArrayList<Helicopter> searchHelicopters(int passengerSeats, double loadCapacity, double flightRange) {
        return new ArrayList<>(helicopterRepository.getHelicoptersByPassengerSeatsGreaterThanAndLoadCapacityGreaterThanAndFlightRangeGreaterThan(passengerSeats, loadCapacity, flightRange));
    }
}
