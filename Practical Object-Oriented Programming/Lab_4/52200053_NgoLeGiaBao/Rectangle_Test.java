public class Rectangle_Test {
    public static void main (String [] args) {
        Rectangle ra_1 = new Rectangle();
        Rectangle ra_2 = new Rectangle(5, 6);
        Rectangle ra_3 = new Rectangle (-5,7);

        System.out.println("Area first rectangle is: " + ra_1.getArea());
        System.out.println("Area second rectangle is: " + ra_2.getArea());
        System.out.println("Area third rectangle is: " + ra_3.getArea());
        
        System.out.println("Perimeter first rectangle is: " + ra_1.getPerimeter());
        System.out.println("Perimeter second rectangle is: " + ra_2.getPerimeter());
        System.out.println("Perimeter third rectangle is: " + ra_3.getPerimeter());

        System.out.println("String first rectangle is: " + ra_1);
        System.out.println("String second rectangle is: " + ra_2);
        System.out.println("String third rectangle is: " + ra_3);
    }
}
