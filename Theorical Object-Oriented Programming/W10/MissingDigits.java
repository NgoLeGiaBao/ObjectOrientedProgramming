import java.util.*;
public class MissingDigits {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> listDigit = new ArrayList <Integer> ();
        int num, remainder;
        System.out.print ("Enter number from the keyboard: ");
        num = sc.nextInt ();
        System.out.print ("Missing digits in " + num + ": ");
        while (num > 0) {
            remainder = num % 10;
            listDigit.add (remainder);
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (!listDigit.contains(i)) {
                System.out.print (i + " ");
            }
        }
    }

}