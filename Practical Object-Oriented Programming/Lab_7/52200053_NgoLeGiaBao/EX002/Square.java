public class Square extends Rectangle {
    public Square () {
        super();
    }
    public Square (double side) {
        super(side, side);
    }
    public Square (double side, String color, boolean filled) {
        super (color, filled, side, side);
    }
    public double getSide (){
        return this.length;
    }
    public void setSide (double side) {
        this.length = side;
        this.width = side;
    }
    public void setWidth (double width) {
        this.setSide(width);
    }
    public void setLength (double length) {
        this.setLength(length);
    }
}
