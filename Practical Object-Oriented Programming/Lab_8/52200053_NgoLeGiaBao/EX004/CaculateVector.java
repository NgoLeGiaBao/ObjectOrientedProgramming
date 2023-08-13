import java.util.*;
public class CaculateVector {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        int xValue, yValue;
        do {
            System.out.print ("Enter length n of vector: ");
            n = sc.nextInt();
        } while (n <= 0);
        Vector <Integer> X = new Vector <Integer> ();
        for (int i = 0; i < n; i++) {
            System.out.print ("Enter value x at " + i + ": ");
            xValue = sc.nextInt();
            X.add(xValue);
        }
        System.out.println ("Caculate y value corresponding x value");
        for (int x : X) {
            yValue = (2 * x * x) + 1;
            System.out.println ("When xValue = " + x + ", yValue = " + yValue);
        }
    }
}