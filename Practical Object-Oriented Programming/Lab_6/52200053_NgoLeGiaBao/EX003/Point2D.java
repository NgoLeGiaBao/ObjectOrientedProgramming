public class Point2D {
    protected double x;
    protected double y;

    public Point2D () {
        this.x = 1;
        this.y = 1;
    }
    public Point2D (double x, double y) {
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
    public double [] getXY () {
        double [] arrayXY = new double [2];
        arrayXY[0] = this.getX();
        arrayXY[1] = this.getY();
        return arrayXY;
    }
    public void setXY (double x, double y) {
        this.setX (x);
        this.setY(y);
    }
    public String toString () {
        return "Point 2D[x = " + this.x + " - y = " + this.y + "]";
    }
}