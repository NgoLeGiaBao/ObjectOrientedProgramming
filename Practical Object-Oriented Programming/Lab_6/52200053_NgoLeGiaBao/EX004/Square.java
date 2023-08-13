public class Square extends Rectangle {
    public Square () {
        super();
    }
    public Square (double side) {
        super(side, side);
    }
    public Square (double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide () {
       return super.getWidth();
    }
    public void setSide (double side) {
        super.setWidth (side);
        super.setLength (side);
    }
    public void setWidth (double width) {
        this.setSide (width);
    }
    public void setLength (double length) {
        this.setSide (length);
    }
    public String toString () {
         return "Square [" + super.color + " - " + super.filled + " - " + super.length + " - " + super.width + " - " + super.getArea() + " - " + super.getPerimeter() + "]";
    }
}
