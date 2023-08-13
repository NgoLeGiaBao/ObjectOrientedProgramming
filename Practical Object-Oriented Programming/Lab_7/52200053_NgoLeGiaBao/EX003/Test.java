public class Test {
    public static void main(String[] args) {
        Movable mvp1 = new MovablePoint (4,5,2,2);
        System.out.println ("MVP1 is initial: " + mvp1);
        mvp1.moveDown();
        System.out.println ("MVP1 after move down: " + mvp1);
        mvp1.moveRigth ();
        System.out.println ("MVP1 after move rigth: " + mvp1);
        mvp1.moveLeft ();
        System.out.println ("MVP1 after move left: " + mvp1);
        mvp1.moveUp();
        System.out.println ("MVP1 after move up: " + mvp1);

        MovableCircle mvc1 = new MovableCircle(8,10,2,4,6);
        System.out.println ("MVC1 is initial: " + mvc1);
        mvc1.moveDown();
        System.out.println ("MVC1 after move down: " + mvc1);
        mvc1.moveRigth ();
        System.out.println ("MVC1 after move rigth: " + mvc1);
        mvc1.moveLeft ();
        System.out.println ("MVC1 after move left: " + mvc1);
        mvc1.moveUp();
        System.out.println ("MVC1 after move up: " + mvc1);
    }
}
