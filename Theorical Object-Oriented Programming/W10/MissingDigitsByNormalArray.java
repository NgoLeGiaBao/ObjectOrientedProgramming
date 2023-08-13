import java.util.*;
public class MissingDigitsByNormalArray {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int number, remainder;
        System.out.print("Enter number from the keyboard: ");
        number = sc.nextInt();
        boolean [] arrElement = new boolean [10];
        while (number > 0) {
            remainder = number % 10;
            arrElement[remainder] = true;
            number /= 10;
        }
        System.out.print ("Missing digits in number is: ");
        for (int i = 0; i < 10; i++) {
            if (!arrElement[i]) {
                System.out.print (i + " ");
            }
        }
    }
}