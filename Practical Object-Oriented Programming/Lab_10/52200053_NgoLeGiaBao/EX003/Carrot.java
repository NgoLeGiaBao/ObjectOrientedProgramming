public class Carrot implements Vegetable {
    private String type;
    public Carrot (String type) {
        this.type = type;
    }
    public String getInfo () {
        return "Carrot[Type = " + this.type + "]"; 
    }
    
}