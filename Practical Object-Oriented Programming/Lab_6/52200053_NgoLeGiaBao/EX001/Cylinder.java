public class Cylinder extends Circle {
    private double heigth;
    public Cylinder (){
        super ();
        this.heigth = 1;
    }
    public Cylinder (double radius) {
        super(radius);
        this.heigth = 1;
    }
    public Cylinder (double radius, double heigth) {
        super(radius, "Red");
        this.heigth = heigth;
    }
    public Cylinder (double radius, double heigth, String color) {
        super(radius, color);
        this.heigth = heigth;
    }
    public double getHeigth () {
        return this.getHeigth();
    }
    public void setHeigth (double heigth) {
        this.heigth = heigth;
    }
    public double getVolume () {
        return super.getArea()* this.heigth;
    }
    public String toString () {
        return super.toString() + " - " + this.getVolume();
    }
}
