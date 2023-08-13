public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape () {
        this.color = "red";
        this.filled = filled;
    }
    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor () {
        return this.color;
    }
    public boolean getFilled () {
        return this.filled;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    public boolean equals (Shape shape) {
        if (shape instanceof Shape) {
            return this.getArea() == shape.getArea();
        }
        return false;
    }
    public abstract double getArea ();
    public abstract double getPerimeter ();
}