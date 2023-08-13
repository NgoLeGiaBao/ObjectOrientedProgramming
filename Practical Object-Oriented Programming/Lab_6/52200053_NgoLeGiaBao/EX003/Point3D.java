public class Point3D extends Point2D {
    private double z;
    public Point3D () {
        super();
        this.z = 1;
    }
    public Point3D (double x, double y, double z) {
        super (x, y);
        this.z = z;
    }
    public double getZ () {
        return this.z;
    }
    public double [] getXYZ () {
        double [] arrayXYZ = new double [3];
        arrayXYZ[0] = super.getX();
        arrayXYZ[1] = super.getY();
        arrayXYZ[2] = this.getZ();
        return arrayXYZ;
    }
    public void setZ (double z) {
        this.z = z;
    } 
    public void setXYZ (double x, double y, double z) {
        super.setX (x);
        super.setY(y);
        this.setZ(z);
    }
    public String toString () {
        return "Point 3D[x = " + this.x + " - y = " + this.y + " - z = " + this.z + "]";
    }
}
