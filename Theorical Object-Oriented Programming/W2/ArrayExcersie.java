
import java.util.Scanner;
public class ArrayExcersie{
    public static void listNegative (int[] arr) {
        System.out.print ("List all negative in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print (arr[i] + " ");
            }
        }
    }
    public static int maxValue (int[] arr) {
        int max;
        int number = arr.length;
        if (number == 0) {
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
    public static int[] arrayAscending (int[] arr) {
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
        return arr;
    }
    public static int[] addElemetAtFirstPostion (int[] arr, int x) {
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        return arr;
    }
    public static int[] deleteFirstElementPositiveNumber (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            return arr;
            }

        }
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print ("Enter n: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print ("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print ("The value of all elements in array: ");
        for (int i = 0; i < n; i++) {
            System.out.print (arr[i] + " ");
        }
        // System.out.println();
        // listNegative (arr);
        // System.out.println();
        // System.out.println ("The max value in array is: " + maxValue(arr));
        // arrayAscending(arr);
        // System.out.print ("Array is ascending: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print (arr[i] + " ");
        // }
        // System.out.println();
        // int addN = n + 1;
        // arr = new int [addN];
        // for (int i = 0; i < n; i++) {
        //     System.out.print ("arr[" + i + "] = ");
        //     arr[i] = sc.nextInt();
        // }
        // addElemetAtFirstPostion(arr,4);
        System.out.println();
        deleteFirstElementPositiveNumber(arr);
        for (int i = 0; i < n-1; i++) {
            System.out.print (arr[i] + " ");
        }


    }
}