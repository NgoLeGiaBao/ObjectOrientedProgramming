import java.math.BigDecimal;
import java.util.Scanner;

public class ArrayProcess {
    public static void main (String [] args) {
        int [] arr = {4, -3, 5, 11, 6, 4, 8};
        int [] arr_2 = {4, 9, 1, 7, 6, 10};
        Scanner sc = new Scanner (System.in);

        // EX001
        System.out.println("Max value in array: " + findMax(arr));
        
        // EX002
        System.out.println("Min value in array: " + findMin(arr));
        
        // EX003
        System.out.println("Sum even numbers in array is: " + evenSum(arr));
        
        // EX004
        System.out.println ("The number of elements is same k: " + countSpecific(arr, 4));
        
        // EX005
        System.out.println("The number of elements is prime number in arr is: " + countElementPrime(arr));
        
        // EX006
        System.out.println("The first index of k in array is: " + find(arr, 5));
        
        // EX007
        System.out.print("The array after square is: ");
        square(arr_2);
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print (arr_2[i] + " ");
        }
        System.out.println();

        // EX008
        int elememtBigDecimal;
        System.out.print ("Enter number Big Decimal elements: ");
        elememtBigDecimal = sc.nextInt();
        BigDecimal[] bdc = new BigDecimal [elememtBigDecimal];
        for (int i = 0; i < bdc.length; i++) {
            System.out.print ("bdc[" + i +"] = ");
            bdc[i] = sc.nextBigDecimal();
        }
        System.out.print ("Array big decimal number is: ");
        for (BigDecimal elememt : bdc) {
            System.out.print (elememt + " ");
        }
        System.out.println();
        System.out.println("Max Value in Big Decimal Array is: " + findMax(bdc));
    
        // EX009
        System.out.print("Array includes numbers divible 2 is: ");
        for (int i = 0; i < divisibleNumber(arr, 2).length; i++) {
            System.out.print (divisibleNumber(arr, 2)[i] + " ");
        }
        System.out.println();
        
        // EX010
        System.out.println("The third max number in array is: " + findThirdMax(arr));
    }

    public static int findMax (int arr[]) {
        int max;
        if (arr.length == 0) {
            return -1;
        } else {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static int findMin (int arr[]) {
        int min;
        if (arr.length == 0) {
            return -1;
        } else {
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min =arr[i];
                }
            }
        }
        return min;
    }

    public static int evenSum (int arr[]) {
        int sum = 0;
        for (int elememt: arr) {
            if (elememt % 2 == 0) {
                sum += elememt;
            }
        }
        return sum;
    }

    public static int countSpecific (int arr[], int k) {
        int count = 0;
        for (int elememt: arr) {
            if (elememt == k) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkPrime (int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countElementPrime (int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i]) == true) {
                count++;
            }
        }
        return count;
    }

    public static int find (int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void square (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] * arr[i]);
        }
    }

    public static BigDecimal findMax (BigDecimal[] arr) {
       BigDecimal result = arr[0];
       for (BigDecimal elememt : arr) {
            if (elememt.compareTo(result) == 1) {
                result = elememt;
            }
       }
       return result;
    }

    public static int countDivisibleK (int arr[], int k) {
        int count = 0;
        for (int temp : arr) {
            if (temp % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static int [] divisibleNumber (int arr[], int k) {
        int [] arrDisivleK = new int [countDivisibleK(arr, k)];
        int i = 0;
        for (int temp : arr) {
            if (temp % k == 0) {
                arrDisivleK[i++] = temp; 
            }
        }
        return arrDisivleK;
    }

    public static int findThirdMax (int arr[]) {
        int n = arr.length;
        while (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            n--;
        }
        return arr[arr.length - 3];
    }
}