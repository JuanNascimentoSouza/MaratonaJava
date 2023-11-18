package padroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSCTANCE;
    private final Set<String> availablesSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");

    }

    public static AircraftSingletonLazy getInstance() {
        if (INSCTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSCTANCE == null) {
                    INSCTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSCTANCE;
    }

    public boolean bookSeat(String seat) {
        return availablesSeats.remove(seat);
    }
}
