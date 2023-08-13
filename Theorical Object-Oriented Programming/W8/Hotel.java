public class Hotel extends AccommodationService {
    private String hotelName;
    private int numberOfStars;

    public Hotel (String position, double basicPrice, String hotelName, int numberOfStars) {
        super (position, basicPrice);
        this.hotelName = hotelName;
        this.numberOfStars = numberOfStars;
    }
    public double basicPriceRent () {
        if (numberOfStars <= 2) 
            return this.basicPrice + (this.basicPrice * this.tax());
        return (this.basicPrice + (this.basicPrice * this.tax())) * 1.1;
    }
}