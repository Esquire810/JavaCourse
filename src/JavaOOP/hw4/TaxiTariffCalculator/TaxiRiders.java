package JavaOOP.hw4.TaxiTariffCalculator;

import java.util.ArrayList;
import java.util.List;

public class TaxiRiders {
    private final List<TaxiRide>  taxiRiders = new ArrayList<>();

    public void add(TaxiRide ride){
        taxiRiders.add(ride);
    }

    public long getPrice(TaxiTariff tariff){
        long sumPrice = 0;
        for (TaxiRide taxiRider : taxiRiders) {
            sumPrice += tariff.calculatePrice(taxiRider);
        }
        return sumPrice;
    }
}
