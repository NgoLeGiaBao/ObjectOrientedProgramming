public class VegetableFactory {
    public static Vegetable getVegetable (String type) {
        if (type.equals("Cabbage".toUpperCase())) {
            return new Cabbage("Huge Cabbage", 17);
        } else if (type.equals("Carrot".toUpperCase())) {
            return new Carrot ("Tiny carrot");
        } else if (type.equals("Pumpkin".toUpperCase())) {
            return new Pumpkin (1.6);
        }
        return null;
    }
}