public class House {
    private String houseCode;
    private int numOfBedRoom;
    private boolean hasSwimming;
    private double area;
    private double costPerSquareMeter;
    
    public House () {
        this.houseCode = "A01";
        this.numOfBedRoom = 2;
        this.hasSwimming = false;
        this.area = 0;
        this.costPerSquareMeter = 0;
    }
    public House (String houseCode, int numOfBedRoom, boolean hasSwimming, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRoom = numOfBedRoom;
        this.hasSwimming = hasSwimming;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }
    public String getHouseCode (){
        return this.houseCode;
    }
    public int getNumOfBedRoom () {
        return this.numOfBedRoom;
    }
    public boolean getHasSwimming () {
        return this.hasSwimming;
    }
    public double getArea () {
        return this.area;
    }
    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }
    public void setHouseCode (String houseCode) {
        this.houseCode = houseCode;
    }
    public void setNumOfBedRoom (int numOfBedRoom) {
        this.numOfBedRoom = numOfBedRoom;
    }
    public void setHasSwimming (boolean hasSwimming) {
        this.hasSwimming = hasSwimming;
    }
    public void setArea (double area) {
        this.area = area;
    }
    public void setCostPerSquareMeter (double getCostPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }
    public double calucateSellingPrice () {
        double subTotal, sellingPrice;
        subTotal = this.getArea() * this.getCostPerSquareMeter();
        if (this.getHasSwimming()) {
            subTotal += subTotal * 0.1;
            sellingPrice = subTotal + (subTotal * 0.15);
        } else {
            sellingPrice = subTotal + (subTotal * 0.15);
        }
        return sellingPrice;
    }
    public String toString () {
        return "House [" + this.getHouseCode() + ", " + this.getNumOfBedRoom() + ", " + this.getHasSwimming() + ", " + this.calucateSellingPrice() + "]";
    }
}
