package sgu.airport.service.comparator;

import sgu.airport.model.aircraft.Aircraft;
import java.util.Comparator;

public class FlightVehicleRangeComparator implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {

        return Double.compare(o1.getFlightRange(), o2.getFlightRange());
    }
}
