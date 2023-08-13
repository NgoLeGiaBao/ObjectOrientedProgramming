public class Test {
    public static void main (String [] args) {
        Square sq1 = new Square ();
        Square sq2 = new Square (5);
        Square sq3 =new Square (7, "Green", true);

        System.out.println (sq1);
        System.out.println (sq2);
        sq2.setLength(6);
        System.out.println(sq2);

        System.out.println(sq3);
        sq3.setWidth (8);
        System.out.println(sq3);
    }
}