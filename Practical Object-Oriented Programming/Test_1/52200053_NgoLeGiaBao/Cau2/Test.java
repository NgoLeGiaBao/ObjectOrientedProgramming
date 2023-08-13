public class Test {
    public static void main (String [] args) {
        IceCream ic1 = new IceCream ("Mango", 100, 10);
        IceCream ic2 = new IceCream ("Dubai", 100, 10);
        IceCream ic3 = new IceCream();
        System.out.println (ic1.totalCost(10));
        System.out.println (ic3);
    }
}