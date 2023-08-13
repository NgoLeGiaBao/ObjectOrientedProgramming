import java.util.Scanner;
public class MyFirstProgram {
    public static int remainder (int number, int division) {
        return number % division;
    }
    public static double covertTemperatureFromFehrenheitToCelsius (double fehrenheit) {
        return (5.0/9) * (fehrenheit - 32);
    }
    public static double covertTemperatureFromCelsiusToFehrenheit (double celsius) {
        return (celsius * (9.0/5)) + 32;
    }
    public static boolean checkLeapYear (int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int minimumBetweenNumber (int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a) {
            return b;
        } else {
            return c;
        }
    }
    public static boolean alphanumeric (char character) {
        if ((character >= '0' & character <= '9') || (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
    public static int formual8a(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    public static int formual8b (int n) {
        int times = 1;
        for (int i = 1; i <= n; i++) {
            times *= i;
        }
        return times;
    }
    public static int formual8c (int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += Math.pow(2, i);
        }
        return total;
    }
    public static double formual8d (int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
               total += 1.0/(2*n); 
        }
        return total;
    }
    public static int formual8e (int n) {
        int total = 0;
        for (int i =1; i <= n; i++) {
            total += Math.pow(i, 2);
        }
        return total;
    }
    public static void hailstoneSequence (int n) {
        while (n > 1) {
            if (n % 2 != 0) {
                System.out.println(n + " is odd, so we take 3*n + 1: " + (3*n+1));
                n = 3*n+1;
            } else {
                System.out.println(n + " is even, so we take n/2: " + n/2);
                n /= 2;
            }
        }
    }
    public static int sumFirstLastDigit (int number) {
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number/= 10;
        }

        return firstDigit  + lastDigit;
    }
    public static int countDigit (int number) {
        int countDigit = 0;
        while (number > 0) {
            countDigit++;
            number/= 10;
        }
        return countDigit;
    }
    public static int reverseNumber (int number) {
        int reverseNumber = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number /= 10;
        }
        return reverseNumber;
    }
    public static boolean palindrone (int number) {
        if (number == reverseNumber(number)) {
            return true;
        }
        return false;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        // Question 1
        String name, dateOfBirth, studentID;
        System.out.print ("Entering name: ");
        name = sc.nextLine();
        System.out.print ("Entering date of birth: ");
        dateOfBirth = sc.nextLine();
        System.out.print ("Entering student ID: ");
        studentID = sc.nextLine();
        System.out.println ("Name is: " + name);
        System.out.println ("Date of birth is: " + dateOfBirth);
        System.out.println ("Student ID: " + studentID);

        // Question 2
        double area, base, height;
        System.out.print ("Entering base: ");
        base = sc.nextDouble ();
        System.out.print ("Entering height: ");
        height = sc.nextDouble();
        area = (1.0/2) * base * height;
        System.out.println ("Area is: " + area);

        // Question 3
        System.out.println ("Remainder is: " + remainder(10,3));
        System.out.println ("Remainder is: " + remainder(0,3));
        System.out.println ("Remainder is: " + remainder(10,10));
        
        // Question 4
        System.out.println ("Covert temperature from Fehrenheit to Celsius: " + covertTemperatureFromFehrenheitToCelsius(123.5));
        System.out.println ("Covert temperature from Fehrenheit to Celsius: " + covertTemperatureFromCelsiusToFehrenheit(50.833333333333336));
    
        // Question 5
        boolean conclusion = checkLeapYear(2020);
        if (conclusion) {
            System.out.println ("It is a leap year");
        } else {
            System.out.println ("It is not a leap year");
        }

        // Question 6
         System.out.println ("Minimum between three number is: " + minimumBetweenNumber(4,9,1));

        // Question 7
        System.out.println ("Character n is a Alphanumeric: " + alphanumeric('n'));
        System.out.println ("Character % is a Alphanumeric: " + alphanumeric('%'));
        System.out.println ("Character 1 is a Alphanumeric: " + alphanumeric('1'));

        // Question 8
        System.out.println ("Formual 8a is " + formual8a(5));
        System.out.println ("Formual 8b is " + formual8b(5));
        System.out.println ("Formual 8c is " + formual8c(5));
        System.out.println ("Formual 8d is " + formual8d(5));
        System.out.println ("Formual 8e is " + formual8e(5));

        // Question 9
        hailstoneSequence(5);

        // Question 10
        System.out.println ("Sum first and last digit is: " + sumFirstLastDigit(4831));
        System.out.println ("Sum first and last digit is: " + sumFirstLastDigit(5531));
        System.out.println ("Sum first and last digit is: " + sumFirstLastDigit(9839));

        // Question 11
        System.out.println ("The number digit in number is: " + countDigit(421));
        System.out.println ("The number digit in number is: " + countDigit(8341));
        System.out.println ("The number digit in number is: " + countDigit(43));

        // Question 12
        System.out.println ("5492 has reversed number is: " + reverseNumber(5942));
        System.out.println ("48392 has reversed number is: " + reverseNumber(48392));
        System.out.println ("2014 has reversed number is: " + reverseNumber(2014));

        // Question 13
        System.out.println ("1221 is palindrome is: " + palindrone(1221));
        System.out.println ("8299 is palindrome is: " + palindrone(8299));
        System.out.println ("4334 is palindrome is: " + palindrone(4334));
        
        // Question 14
        int selection;
        double money;
        do {
            System.out.println ("-----Menu-----");
            System.out.println ("1. Coca");
            System.out.println ("2. Pepsi");
            System.out.println ("3. Sprite");
            System.out.println ("4. Snack");
            System.out.println ("5. Shutdown Machine");
            System.out.print ("Please enter the number: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1: 
                    System.out.print("The price of Coca is: 2$, please enter the amount of money: ");
                    money = sc.nextDouble();
                    if (money < 2) {
                        System.out.println ("Not enough money to this item. Please select again.");
                    } else {
                        System.out.println ("Your charge is: " + (money - 2));
                    }
                    break;
                case 2:
                    System.out.print("The price of Pepsi is: 2.5$, please enter the amount of money: ");
                    money = sc.nextDouble();
                    if (money < 2.5) {
                        System.out.println ("Not enough money to this item. Please select again.");
                    } else {
                        System.out.println ("Your charge is: " + (money - 2.5));
                    }
                    break;
                case 3: 
                    System.out.print("The price of Sprite is: 1.5$, please enter the amount of money: ");
                    money = sc.nextDouble();
                    if (money < 1.5) {
                        System.out.println ("Not enough money to this item. Please select again.");
                    } else {
                        System.out.println ("Your charge is: " + (money - 1.5));
                    }
                    break;
                case 4:
                    System.out.print("The price of Pepsi is: 1$, please enter the amount of money: ");
                    money = sc.nextDouble();
                    if (money < 1) {
                        System.out.println ("Not enough money to this item. Please select again.");
                    } else {
                        System.out.println ("Your charge is: " + (money - 1));
                    }   
                    break;                 
                case 5:
                    System.out.println ("Shutdown Machine");
                    break;
                default:
                    System.out.println ("Please enter valid number");
            }
        } while (selection != 5);

    }
}