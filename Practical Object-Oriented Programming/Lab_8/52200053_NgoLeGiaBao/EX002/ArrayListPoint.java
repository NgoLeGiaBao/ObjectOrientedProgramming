import java.util.ArrayList;
import java.lang.Math;
public class ArrayListPoint {
    private ArrayList <Point> listPoint = new ArrayList <Point> ();
    public void addPoint (Point p) {
        this.listPoint.add(p);
    }
    public void calculateDistance () {
        for (Point point : listPoint) {
            double distance = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
            System.out.println ("Distance from " + point + " to center is: " + distance);
        }
    }
    public static void main (String [] args) {
        ArrayListPoint arlp = new ArrayListPoint ();
        Point p1 = new Point (3,4);
        Point p2 = new Point (8,6);

        arlp.addPoint(p1);
        arlp.addPoint(p2);

        arlp.calculateDistance();
    }
}