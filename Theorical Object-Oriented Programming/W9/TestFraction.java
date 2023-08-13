import java.util.Scanner;
public class TestFraction {
    public static void main (String [] args) {
        int numer, denom;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter 1s fraction: ");
        numer = sc.nextInt();
        denom = sc.nextInt();
        FractionI f1 = new Fraction(numer, denom);

        System.out.print ("Enter 2nd fraction: ");
        numer = sc.nextInt();
        denom = sc.nextInt();
        FractionI f2 = new Fraction(numer, denom);

        int selection;
        do {
            System.out.println ("0. Exit");
            System.out.println ("1. To add two fraction");
            System.out.println ("2. To minus two fraction");
            System.out.println ("3. To times two fraction");
            System.out.println ("4. To simplify fraction");
            System.out.println ("5. Check two fraction equal");
            System.out.print ("Enter your selection: ");
            selection = sc.nextInt();
            if (selection == 1) {
                System.out.println ("Result of add f1 and f2 is: " + f1.add(f2));
            } else if (selection == 2) {
                System.out.println ("Result of minus f1 and f2 is: " + f1.minus(f2));
            }else if (selection == 3) {
                System.out.println ("Result of times f1 and f2 is: " + f1.times(f2));
            } else if (selection == 4){
                System.out.println (f1 + " simplify is: " + f1.simplify());
                System.out.println (f2 + " simplify is: " + f2.simplify());

            } else if (selection == 0) {
                System.out.println ("End program");
            } else if (selection == 5) {
                if (f1.equals(f2)) {
                    System.out.println ("Two fraction is equals");
                } else {
                    System.out.println ("Two fraction is not equals");
                }
            } else {
                System.out.println ("Let select number 0, 1, 2, 3 or 4");
            }
        } while (selection != 0);
    }
}