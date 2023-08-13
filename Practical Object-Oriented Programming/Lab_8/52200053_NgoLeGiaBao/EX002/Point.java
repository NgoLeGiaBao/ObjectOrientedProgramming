public class Point {
    private double x, y;
    public Point () {
        this.x = 0;
        this.y = 0;
    }
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX () {
        return this.x;
    }
    public double getY () {
        return this.y;
    }
    public void setX (double x) {
        this.x = x;
    }
    public void setY (double y) {
        this.y = y;
    }
    public String toString () {
        return "Point["+ this.x + "," + this.y +"]";
    }
}