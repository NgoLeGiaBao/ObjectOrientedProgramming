import java.lang.Math;
public class Circle extends Shape {
    private double radius;

    public Circle () {
        super();
        this.radius = 0;
    }
    public Circle (double radius) {
        super();
        this.radius = radius;
    }
    public Circle (String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius () {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter () {
        return 2 * Math.PI * this.radius;
    }
    public String toString () {
        return "Circle [Radius = " + this.radius + ", Color = " + this.color + ", Filled = " + this.filled + ", Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter() + "]"; 
    }
}
