package sgu.airport.init;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import sgu.airport.model.flightVehicle.Airline;
import sgu.airport.model.flightVehicle.Helicopter;
import sgu.airport.repository.flightVehicle.AirlineRepository;
import sgu.airport.repository.flightVehicle.HelicopterRepository;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class DataInit {
    private static final String AIRLINES = "classpath:json_data/airlines.json";
    private static final String HELICOPTERS = "classpath:json_data/helicopters.json";

    private final AirlineRepository airlineRepository;
    private final HelicopterRepository helicopterRepository;
    private final ResourceLoader resourceLoader;

    @Autowired
    public DataInit(AirlineRepository airlineRepository,
                    HelicopterRepository helicopterRepository,
                    ResourceLoader resourceLoader
    ){
        this.airlineRepository = airlineRepository;
        this.helicopterRepository = helicopterRepository;
        this.resourceLoader = resourceLoader;
    }

    public String readFile(String string) throws Exception {
        String content;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                resourceLoader.getResource(string).getInputStream()))) {
            content = reader.lines().collect(Collectors.joining());
        }
        return content;
    }

    @PostConstruct
    public void init() throws Exception {

        ArrayList<Airline> airlines = new ObjectMapper().readValue(readFile(AIRLINES),
                new TypeReference<ArrayList<Airline>>() {});

        ArrayList<Helicopter> helicopters = new ObjectMapper().readValue(readFile(HELICOPTERS),
                new TypeReference<ArrayList<Helicopter>>() {});

        airlineRepository.saveAll(airlines);
        helicopterRepository.saveAll(helicopters);

    }

}
