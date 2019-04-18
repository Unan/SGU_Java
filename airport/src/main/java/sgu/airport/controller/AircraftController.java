package sgu.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sgu.airport.model.flightVehicle.Airline;
import sgu.airport.repository.CargoAircraftRepository;
import sgu.airport.repository.CargoHelicopterRepository;
import sgu.airport.repository.QuadcopterRepository;
import sgu.airport.repository.flightVehicle.AirlineRepository;
import sgu.airport.repository.flightVehicle.HelicopterRepository;

import java.util.List;

@Controller
public class AircraftController {

    private final AirlineRepository airlineRepository;
    private final HelicopterRepository helicopterRepository;
    private final CargoAircraftRepository cargoAircraftRepository;
    private final CargoHelicopterRepository cargoHelicopterRepository;
    private final QuadcopterRepository quadcopterRepository;

    @Autowired
    AircraftController(AirlineRepository airlineRepository,
                       HelicopterRepository helicopterRepository,
                       CargoAircraftRepository cargoAircraftRepository,
                       CargoHelicopterRepository cargoHelicopterRepository,
                       QuadcopterRepository quadcopterRepository
    ) {
        this.airlineRepository = airlineRepository;
        this.helicopterRepository = helicopterRepository;
        this.cargoAircraftRepository = cargoAircraftRepository;
        this.cargoHelicopterRepository = cargoHelicopterRepository;
        this.quadcopterRepository = quadcopterRepository;
    }

    @GetMapping
    public ResponseEntity<List<Airline>> hello() {
        return ResponseEntity.ok(airlineRepository.getAllBy());
    }


}
