public class Test {
    public static void main (String [] args) {
        ResizeableCircle rsc1 = new ResizeableCircle();
        System.out.println (rsc1.getArea());
        System.out.println (rsc1.getPerimeter());
        
        rsc1.resize(5);
        System.out.println ("Circle area with radius 5: " + rsc1.getArea());
        System.out.println ("Circle area with radius 5: " + rsc1.getPerimeter());

        rsc1.resize(7);
        System.out.println ("Circle area with radius 7: " + rsc1.getArea());
        System.out.println ("Circle area with radius 7: " + rsc1.getPerimeter());

        rsc1.resize(3);
        System.out.println ("Circle area with radius 3: " + rsc1.getArea());
        System.out.println ("Circle area with radius 3: " + rsc1.getPerimeter());
    }
}