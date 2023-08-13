public class Villa extends AccommodationService {
    private String villaName;
    private int numberOfBedrooms;

    public Villa (String position, double basicPrice, String villaName, int numberOfBedrooms) {
        super (position, basicPrice);
        this.villaName = villaName;
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public double basicPriceRent () {
        if (this.numberOfBedrooms <= 2)
            return this.basicPrice + 3000000;
        if (this.numberOfBedrooms <= 5) {
            return this.basicPrice + 3000000 + ((this.numberOfBedrooms - 2)*2000000);
        }
        return this.basicPrice + 3000000 + (3*2000000) + ((this.numberOfBedrooms - 5)*1000000);
    }
}