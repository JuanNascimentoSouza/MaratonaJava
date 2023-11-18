package padroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availablesSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");

    }

    public boolean bookSeat(String seat) {
        return availablesSeats.remove(seat);

    }

    public String getName() {
        return name;
    }
}

