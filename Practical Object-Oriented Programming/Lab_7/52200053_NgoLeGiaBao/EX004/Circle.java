import java.lang.Math;
public class Circle implements GeometricObject {
    protected double radius;
    public Circle () {
        this.radius = 0;
    }
    public double getArea () {
        return Math.PI * radius * radius;
    }
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }
}