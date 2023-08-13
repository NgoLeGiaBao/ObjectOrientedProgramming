public class House_Test {
    public static void main (String [] args) {
        House h1 = new House ();
        House h2 = new House("A02", 3, true, 100, 250);
        House h3 = new House ("B02", 4, false, 200, 150);

        System.out.println("The price selling's first house is: " + h1.calucateSellingPrice());
        System.out.println("The price selling's second house is: " + h2.calucateSellingPrice());
        System.out.println("The price selling's third house is: " + h3.calucateSellingPrice());

        System.out.println ("The information's first house: " + h1);
        System.out.println ("The information's second house: " + h2);
        System.out.println ("The information's third house: " + h3);
    }   
}
