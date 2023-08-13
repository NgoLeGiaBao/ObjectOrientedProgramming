public class IceCream {
    private String flavor;
    private double costPerScoop;
    private int numberOfRemaining;
    
    public IceCream () {
        this.flavor = "Vanilla";
        this.costPerScoop = 100;
        this.numberOfRemaining = 10;
    }
    public IceCream (String flavor, double costPerScoop, int numberOfRemaining) {
        if ((flavor.equals("Vanilla") ||flavor.equals("Chocolate") ||flavor.equals("Mango") ||flavor.equals("Strawberry")) == false) {
            this.flavor = "Chocolate";
        } else {
            this.flavor = flavor;
        }
        this.costPerScoop = costPerScoop;
        this.numberOfRemaining = numberOfRemaining;
    }
    public double totalCost (int scoop) {
        if (this.flavor.equals("Mango")) {
            return (scoop * this.costPerScoop) - (scoop * this.costPerScoop * 0.05);
        }
        return scoop * this.costPerScoop;
    }
    public String toString () {
        return this.flavor;
    }
}