public class RegularPolygon_Test {
    public static void main (String [] args) {
        RegularPolygon rg1 = new RegularPolygon();
        RegularPolygon rg2 = new RegularPolygon ("RG2",3, 4);

        System.out.println(rg1);
        System.out.println(rg2.getArea());
        System.out.println(rg2.getPerimeter());
        System.out.println(rg2.getPolygon());
        System.out.println(rg2);
    }
}