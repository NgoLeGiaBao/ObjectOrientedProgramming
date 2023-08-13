public class Test {
    public static void main (String [] args) {
        Point2D p2d1 = new Point2D();
        Point2D p2d2 = new Point2D(5, 6);
        Point3D p3d1 = new Point3D();
        Point3D p3d2 = new Point3D(4, 5, 6);

        System.out.println(p2d1);
        System.out.println(p2d2);
        System.out.println(p3d1);
        System.out.println(p3d2);
    }
}