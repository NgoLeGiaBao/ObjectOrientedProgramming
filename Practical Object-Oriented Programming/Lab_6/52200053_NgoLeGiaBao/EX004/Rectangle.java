public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle () {
        super ();
        this.width = 1;
        this.length = 1;
    }
    public Rectangle (double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth () {
        return this.width;
    }
    public double getLength () {
        return this.length;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double getArea () {
        return this.length * this.width;
    }
    public double getPerimeter () {
        return (this.length + this.width) * 2;
    }
    public String toString () {
        return " Rectangle [" + this.color + " - " + this.filled + " - " + this.getArea() + " - " + this.getPerimeter() +"]"; 
    }
}
