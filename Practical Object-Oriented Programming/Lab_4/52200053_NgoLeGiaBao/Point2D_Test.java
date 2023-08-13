public class Point2D_Test {
    public static void main (String [] args) {
        Point2D p2d_1 = new Point2D();
        Point2D p2d_2 = new Point2D(2, 6);
        Point2D p2d_3 = new Point2D(2, -6);

        System.out.println ("Cordinate first constructor is: ");
        System.out.println("x1 = " + p2d_1.getX());
        System.out.println("y1 = " + p2d_1.getY());

        System.out.println ("Cordinate second constructor is: ");
        System.out.println("x2 = " + p2d_2.getX());
        System.out.println("y2 = " + p2d_2.getY());

        System.out.println ("Cordinate third constructor is: ");
        System.out.println("x3 = " + p2d_3.getX());
        System.out.println("y3 = " + p2d_3.getY());
    }
}
