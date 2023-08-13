import java.util.Scanner;
class Array {
    public static int maxEven (int [] a) {
        int i, max;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                break;
            }
        }
        if (i == a.length) {
            return -1;
        }
        max = a[i];
        for (i = 0; i < a.length; i++) {
            if (a[i] > max && a[i] % 2 == 0) {
                max = a[i];
            }
        }
        return max;
    }
    public static int minOdd (int [] a) {
        int i, min;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                break;
            }
        }
        if (i == a.length) {
            return -1;
        }
        min = a[i];
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static int sumMEMO(int[] a) {
        int max = 0;
        int min = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                break;
            }
        }
        if (i < a.length) {
            max = a[i];
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > max) {
                max = a[i];
            }
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                break;
            }
        }
        if (i < a.length) {
            min = a[i];
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] < min) {
                min = a[i];
            }
        }
        return max + min;
    }
    public static int sumEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
    public static int prodOdd(int[] a) {
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                product *= a[i];
            }
        }
        return product;
    }
    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
    public static int[] input(int n) {
        Scanner sc = new Scanner (System.in);
        int [] newArr = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print ("Enter element numbers from the keyboard: ");
        n = sc.nextInt();
        int arr[] = input(n);
        System.out.print ("Array initial is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + " ");
        }
        System.out.println();
        System.out.println ("Max even number in array is: " + maxEven(arr));
        System.out.println("Min odd number in array is: " + minOdd(arr));
        System.out.println("Sum of max even number and min odd number in array is: "+sumMEMO(arr));
        System.out.println("Sum of even numbers in array is: " + sumEven(arr));
        System.out.println("Product of odd numbers in array is: " + prodOdd(arr));
        System.out.println("Index's first even in array is: " + idxFirstEven(arr));
        System.out.println("Index's last odd in array is: " + idxLastOdd(arr));
    }
}