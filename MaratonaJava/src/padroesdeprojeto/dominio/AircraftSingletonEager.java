package padroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSCTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availablesSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");

    }

    public static AircraftSingletonEager getInstance() {
        return INSCTANCE;
    }

    public boolean bookSeat(String seat) {
        return availablesSeats.remove(seat);
    }

}
