public class Test {
    public static void main (String [] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Red", true,1);
        shapes[1] = new Rectangle("Blue", true,4, 4);
        shapes[2] = new Square(4,"Black", true);
        shapes[3] = new Circle(1);
        shapes[4] = new Rectangle("Blue", true,12, 8);

        double max = shapes[0].getArea();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getArea() > max) {
                max = shapes[i].getArea();
            }
        }
        System.out.println("Area shape[1] equals area shape[2] is: " + shapes[1].equals(shapes[2]));
        System.out.println("The max area is: " + max);

    }
}