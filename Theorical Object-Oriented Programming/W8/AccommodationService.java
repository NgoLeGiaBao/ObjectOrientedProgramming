public abstract class AccommodationService {
    protected String position;
    protected double basicPrice;

    public AccommodationService (String position, double basicPrice) {
        this.position = position;
        this.basicPrice = basicPrice;
    }

    public double tax () {
        if (this.position.equals("Vung Tau") || this.position.equals("Nha Trang"))
            return 0.1;
        return 0.05;
    }
    public abstract double basicPriceRent ();
}