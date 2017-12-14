package JavaOOP.hw4.TaxiTariffCalculator;

import java.sql.Time;

public class TaxiRide {
    private final int passengers;
    private final double distance;
    private final int duration;

    public TaxiRide(int passengers, double distance, int duration) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
