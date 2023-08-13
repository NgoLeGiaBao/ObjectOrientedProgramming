public class Test {
    public static void main (String [] args) {
        Circle circleFirst = new Circle();
        Circle circleSecond = new Circle(6, "Green");

        Cylinder cylinderFirst = new Cylinder();
        Cylinder cylinderSecond = new Cylinder(5, 6, "Blue");
        Cylinder cylinderThird = new Cylinder(6);

        System.out.println (circleFirst);
        System.out.println(circleSecond);

        System.out.println(cylinderFirst);
        System.out.println(cylinderSecond);
        System.out.println(cylinderThird);
    }
}
