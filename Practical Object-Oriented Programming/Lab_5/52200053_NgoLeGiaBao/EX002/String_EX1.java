public class String_EX1 {
    public static String shortName(String str) {
        int spaceFirst = str.indexOf(" ");
        int spaceLast = str.lastIndexOf(" ");
        return str.substring(spaceLast+1) + " " + str.substring(0,spaceFirst);
    }
    public static String hashtagName(String str) {
        int spaceFirst = str.indexOf(" ");
        int spaceLast = str.lastIndexOf(" ");
        return "#" + str.substring(spaceLast+1) + str.substring(0,spaceFirst);
    }
    public static boolean checkVowelLetters (char s) {
        char [] vowelLetters = {'a', 'e', 'u', 'i', 'o'};
        for (int i = 0; i < vowelLetters.length; i++) {
            if (s == vowelLetters[i]) {
                return true;
            }
        }
        return false;
    }
    public static String upperCaseAllVowel(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (checkVowelLetters(str.charAt(i))) {
                newString += (str.charAt(i)+"").toUpperCase();
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
    public static String upperCaseAllN(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'n') {
                newString += (str.charAt(i)+"").toUpperCase();
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
    public static void main (String [] args) {
        String s = "Nguyen Le Trong Tin";
        System.out.println ("Short name is: " + shortName(s));
        System.out.println ("Hash tag name is: " + hashtagName(s));
        System.out.println ("Upper case all vowel: " + upperCaseAllVowel(s));
        System.out.println ("Upper case all n: " + upperCaseAllN(s));
    }
}