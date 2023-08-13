public class Triangle extends Shape {
    private double base;
    private double heigth;
    
    public Triangle () {
        super();
        this.base = 0;
        this.heigth = 0;
    }
    public Triangle (double base, double heigth, String color) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }
    public double getBase () {
        return this.base;
    }
    public double getHeigth () {
        return this.heigth;
    }
    public void setBase (double base) {
        this.base = base;
    }
    public void setHeigth (double heigth) {
        this.heigth = heigth;
    }
    public double getArea () {
        return this.base * this.heigth * 1/2.0;
    }
    public String toString () {
        return "Triangle[" + "base = " + base  + ", heigth = " + heigth +", color = " + color + ", area = " + this.getArea()+"]";
    }
}
