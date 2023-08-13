public class Test {
    public static void main (String [] args) {
        AccommodationService acs1 = new Hotel ("Vung Tau", 1000000, "MellBourn", 2);
        AccommodationService acs2 = new Villa ("Vung Tau", 5000000, "StayHome", 6);
        AccommodationService acs3 = new Villa ("Kien Giang", 300000, "Novaland", 2);
        System.out.println (acs1.basicPriceRent());
        System.out.println (acs2.basicPriceRent());
        System.out.println(acs3.basicPriceRent())
    }
}
