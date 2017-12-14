package JavaOOP.hw4.TaxiTariffCalculator;

public class StandardTariff implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride){
        return (long) (30+5*ride.getDistance()+2*ride.getDuration());
    }
}
