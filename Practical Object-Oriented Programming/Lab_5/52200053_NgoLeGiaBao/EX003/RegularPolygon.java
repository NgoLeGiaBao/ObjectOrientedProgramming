public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon () {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }
    public RegularPolygon (String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }
    public RegularPolygon (RegularPolygon rp) {
        this.name = rp.name;
        this.edgeAmount = rp.edgeAmount;
        this.edgeLength = rp.edgeLength;
    }
    public String getName () {
        return this.name;
    }
    public int getEdgeAmount () {
        return this.edgeAmount;
    }
    public double getEdgeLength () {
        return this.edgeLength;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setEdgeAmount (int num) {
        if (num < 3) {
            this.edgeAmount = 3;
        } else {
            this.edgeAmount = num;
        }
    }
    public void setEdgeLength (double length) {
        if (length < 1) {
            this.edgeLength = 1;
        } else {
            this.edgeLength = length;
        }
    }
    public String getPolygon () {
        String kindPolygon;
        if (this.edgeAmount == 3){
            kindPolygon = "Triangle";
        } else if (this.edgeAmount == 4) {
            kindPolygon = "Quadrangle";
        } else if (this.edgeAmount == 5) {
            kindPolygon = "Pentagon";
        } else if (this.edgeAmount == 6){
            kindPolygon = "Hexagon";
        } else {
            kindPolygon = "Polygon has the number of edges greater than 6";
        }
        return kindPolygon;
    }
    public double getPerimeter() {
        return this.getEdgeAmount() * this.getEdgeLength();
    }
    public double getArea () {
        double area = -1;
        if (this.getEdgeAmount() > 6) {
            return -1;
        } else if (this.edgeAmount == 3){
            area = this.getEdgeLength() * this.getEdgeLength() * 0.433;
        } else if (this.edgeAmount == 4) {
            area = this.getEdgeLength() * this.getEdgeLength() * 1;
        } else if (this.edgeAmount == 5) {
            area = this.getEdgeLength() * this.getEdgeLength() * 1.72;
        } else if (this.edgeAmount == 6) {
            area = this.getEdgeLength() * this.getEdgeLength() * 2.595;
        }
        return area;
    }
    public String toString () {
        return this.name + "-" + this.edgeAmount + "-" + (int)this.edgeLength;
    }
}