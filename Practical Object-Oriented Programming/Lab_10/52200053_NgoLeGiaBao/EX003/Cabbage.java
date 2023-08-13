public class Cabbage implements Vegetable {
    private String type;
    private double weight;

    public Cabbage (String type, double weight) {
        this.type = type;
        this.weight = weight;
    }
    public String getInfo () {
        return "Cabbage[Type = " + this.type + ", Weight = " + this.weight + "]"; 
    }
}