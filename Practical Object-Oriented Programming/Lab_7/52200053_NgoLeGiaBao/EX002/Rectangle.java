public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle () {
        super ();
        this.width = 0;
        this.length = 0;
    }
    public Rectangle (double width, double length) {
        super ();
        this.width = width;
        this.length = length;
    }
    public Rectangle (String color, boolean filled, double width, double length) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth () {
        return this.width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getLength () {
        return this.length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double getArea () {
        return this.length * this.width;
    }
    public double getPerimeter () {
        return (this.length * this.width) * 2;
    }
    public String toString () {
        return "Rectangle [Length = " + this.length + ", Width = " + this.width +", Color = " + this.color + ", Filled = " + this.filled + ", Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter() + "]"; 
    }
}
