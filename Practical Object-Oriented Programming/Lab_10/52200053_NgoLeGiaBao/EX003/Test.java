public class Test {
    public static void main (String [] args) {
        Vegetable vg1 = VegetableFactory.getVegetable(VegetableType.CABBAGE+"");
        Vegetable vg2 = VegetableFactory.getVegetable(VegetableType.PUMPKIN+"");
        Vegetable vg3 = VegetableFactory.getVegetable(VegetableType.CARROT+"");

        System.out.println(vg1.getInfo());
        System.out.println(vg2.getInfo());
        System.out.println(vg3.getInfo());
    }
}