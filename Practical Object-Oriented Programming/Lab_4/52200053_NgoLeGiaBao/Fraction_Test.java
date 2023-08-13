public class Fraction_Test {
    public static void main (String [] args) {
        Fraction f_1 = new Fraction();
        Fraction f_2 = new Fraction (10,5);
        Fraction f_3 = new Fraction (1,5);
        
        System.out.println ("Result's add first fraction and second is: " + f_1.add(f_2));
        System.out.println ("Result's add second fraction and third is: " + f_2.add(f_3));
        System.out.println ("Result's add first fraction and third is: " + f_1.add(f_3));

        System.out.println ("Result's sub first fraction and second is: " + f_1.sub(f_2));
        System.out.println ("Result's sub second fraction and third is: " + f_2.sub(f_3));
        System.out.println ("Result's sub first fraction and third is: " + f_1.sub(f_3));

        System.out.println ("Result's mul first fraction and second is: " + f_1.mul(f_2));
        System.out.println ("Result's mul second fraction and third is: " + f_2.mul(f_3));
        System.out.println ("Result's mul first fraction and third is: " + f_1.mul(f_3));

        System.out.println ("Result's div first fraction and second is: " + f_1.div(f_2));
        System.out.println ("Result's div second fraction and third is: " + f_2.div(f_3));
        System.out.println ("Result's div first fraction and third is: " + f_1.div(f_3));

        f_2.reducer();
        System.out.println ("Result's reducer first fraction and third is: " + f_2);
    }

}