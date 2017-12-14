package JavaOOP.hw4.TaxiTariffCalculator;

public class TaxiRunner {
    public static void main(String[] args) {
        TaxiRide taxiRide1 = new TaxiRide(2,2,2);
        TaxiRide taxiRide11 = new TaxiRide(1,1,1);
        TaxiRide taxiRide2 = new TaxiRide(4,2,60);

        TaxiRiders taxiRiders = new TaxiRiders();
        taxiRiders.add(taxiRide1);
        taxiRiders.add(taxiRide2);
        taxiRiders.add(taxiRide11);

        TaxiTariff standard = new StandardTariff();
        TaxiTariff family = new FamilyTariff();
        long standardPrice = taxiRiders.getPrice(standard);
        long familyPrice = taxiRiders.getPrice(family);
        System.out.println(standardPrice);
        System.out.println(familyPrice);
    }
}
