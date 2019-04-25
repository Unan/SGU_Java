package sgu.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sgu.airport.model.aircraft.flightVehicle.Airline;
import sgu.airport.model.aircraft.flightVehicle.FlightVehicle;
import sgu.airport.model.aircraft.flightVehicle.Helicopter;
import sgu.airport.model.parameter.AirlineParameters;
import sgu.airport.service.aircraftService.AircraftService;
import sgu.airport.service.airlineService.AirlineService;
import sgu.airport.service.comparator.FlightVehicleRangeComparator;
import sgu.airport.service.flightVehicleService.FlightVehicleService;
import sgu.airport.service.helicopterService.HelicopterService;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Controller
public class AircraftController {

    private final AirlineService airlineService;
    private final HelicopterService helicopterService;
    private final AircraftService aircraftService;
    private final FlightVehicleService flightVehicleService;

    @Autowired
    AircraftController(AirlineService airlineService, HelicopterService helicopterService, AircraftService aircraftService, FlightVehicleService flightVehicleService) {
        this.airlineService = airlineService;
        this.helicopterService = helicopterService;
        this.aircraftService = aircraftService;
        this.flightVehicleService = flightVehicleService;
    }

    @GetMapping("/getAllAirlines")
    public ResponseEntity<List<Airline>> getAllAircraft() {
        return ResponseEntity.ok(airlineService.getAllAirlines());
    }

    @GetMapping("/getAllHelicopters")
    public ResponseEntity<List<Helicopter>> getAllHelicopters() {
        return ResponseEntity.ok(helicopterService.getAllHelicopters());
    }

    @GetMapping("/getAllFlightVehicles")
    public ResponseEntity<ArrayList<FlightVehicle>> getAllFlightVehicles() {
        ArrayList<FlightVehicle> flightVehicles = new ArrayList<>();
        flightVehicles.addAll(airlineService.getAllAirlines());
        flightVehicles.addAll(helicopterService.getAllHelicopters());
        return ResponseEntity.ok(flightVehicles);
    }

    @PostMapping("/searchAirlines")
    public ResponseEntity<ArrayList<Airline>> searchAirlines(@RequestBody AirlineParameters airlineParameters){
        return ResponseEntity.ok(airlineService.searchAirlines(airlineParameters.getPassengerSeats(), airlineParameters.getLoadCapacity(), airlineParameters.getFlightRange()));
    }

    @PostMapping("/searchHelicopters")
    public ResponseEntity<ArrayList<Helicopter>> searchHelicopters(@RequestBody AirlineParameters airlineParameters){
        return ResponseEntity.ok(helicopterService.searchHelicopters(airlineParameters.getPassengerSeats(), airlineParameters.getLoadCapacity(), airlineParameters.getFlightRange()));
    }

    @PostMapping("/searchFlightVehicles")
    public ResponseEntity<ArrayList<FlightVehicle>> searchFlightVehicles(@RequestBody AirlineParameters airlineParameters) {
        ArrayList<FlightVehicle> flightVehicles = new ArrayList<>();
        flightVehicles.addAll(airlineService.searchAirlines(airlineParameters.getPassengerSeats(), airlineParameters.getLoadCapacity(), airlineParameters.getFlightRange()));
        flightVehicles.addAll(helicopterService.searchHelicopters(airlineParameters.getPassengerSeats(), airlineParameters.getLoadCapacity(), airlineParameters.getFlightRange()));
        return ResponseEntity.ok(flightVehicles);
    }

    @GetMapping("/sortByFlightRange")
    public ResponseEntity<TreeSet<FlightVehicle>> sortByFlightRange(){
        TreeSet<FlightVehicle> flightVehicles = new TreeSet<>(new FlightVehicleRangeComparator());
        flightVehicles.addAll(airlineService.getAllAirlines());
        flightVehicles.addAll(helicopterService.getAllHelicopters());
        return ResponseEntity.ok(flightVehicles);
    }

    @GetMapping("/getTotalLoadCapacity")
    public ResponseEntity<Double> getTotalLoadCapacity(){
        return ResponseEntity.ok(aircraftService.getTotalLoadCapacity());
    }

    @GetMapping("/getTotalPassengerSeats")
    public ResponseEntity<Integer> getTotalPassengerSeats(){
        return ResponseEntity.ok(flightVehicleService.getTotalPassengerSeats());
    }

}
