import java.util.*;
import java.io.*;
public class Calculator {
    public double divide (int a, int b)  throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        } else {
            return a/b;
        }
        
    }
    public int multiply (int a, int b) throws NumberOutOfRangeException {
        if ((a > 1000 || a < -1000) && (b > 1000 || b < -1000)) {
            throw new NumberOutOfRangeException ("Number is outside the computation.");
        } else {
            return a * b;
        }
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.print ("Enter a value: ");
        a = sc.nextInt();       
        System.out.print ("Enter b value: ");
        b = sc.nextInt ();
        
        Calculator cl = new Calculator ();
        try {
            System.out.println (cl.divide(a,b));
        } catch (ArithmeticException err){
            System.out.println (err);
        }
        try {
            System.out.println(cl.multiply(a,b));
        } catch (NumberOutOfRangeException err) {
            System.out.println (err);
        }
        
    }
}
class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}