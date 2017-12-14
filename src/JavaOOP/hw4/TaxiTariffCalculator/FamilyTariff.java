package JavaOOP.hw4.TaxiTariffCalculator;

public class FamilyTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride) {
        return (long) (50+20*ride.getDistance()/ride.getPassengers());
    }
}
