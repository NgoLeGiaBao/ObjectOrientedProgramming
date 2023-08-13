public class Cau1 {
    public static int sumEvenPos (int a[]) {
        int sumEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i % 2 == 0) {
                sumEven += a[i];
            }
        }
        return sumEven;
    }
    public static String lowerCaseCharacter (String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                s += (str.charAt(i)+"").toUpperCase();
            } else {
                s += (str.charAt(i)+"").toLowerCase();
            }    
        }
        return s;
    }
    public static void main (String [] args) {
        int [] arr = {1,-2,3,1,-2,6};
        System.out.println (sumEvenPos(arr));
        System.out.println (lowerCaseCharacter("TrUOng DAi Hoc Ton DuC ThAnG"));
    }
}