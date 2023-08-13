public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle () {
        super();
        this.length = 0;
        this.width = 0;
    }
    public Rectangle (double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double getLength () {
        return this.length;
    }
    public double getWidth () {
        return this.width;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getPerimeter () {
        return (this.width + this.length) * 2;
    }
    public double getArea () {
        return this.width * this.length;
    }
    public String toString () {
        return "Rectangle[" + "length = " + length + ", width = " + width +", color = " + color + ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter() +"]";
    }
}
