import java.util.Scanner;
public class StringExcersie {
    public static int countWords (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }
    public static String firstName (String s) {
        String firstName;
        int position = s.lastIndexOf(' ');
        if (position <= 0) {
            return s;
        } else {
            firstName = s.substring (position + 1);
            return firstName;
        }
    }
    public static String lastName (String s) {
        String lastName;
        int position = s.indexOf(' ');
        if (position <= 0) {
            return s;
        } else {
            lastName = s.substring (0, position);
            return lastName;
        }
    }
    public static String middleName (String s) {
        int firstPosition = s.indexOf(' ');
        int lastPosition = s.lastIndexOf (' ');
        String middleName;
        if (firstPosition == lastPosition) {
            return "No Middle Name";
        } else {
            middleName = s.substring (firstPosition + 1, lastPosition);
            return middleName;
        }
    }
    public static String capitalizeFirstCharacter (String s) {
        String toLowerCase = s.toLowerCase();
        String toUpperCase;
        String capitalizeString = "";
        for (int i = 0; i < toLowerCase.length(); i++) {
    		 if (i == 0) {
    			toUpperCase  = toLowerCase.charAt(i)+"";
    			capitalizeString += toUpperCase.toUpperCase();
    		 } else if (s.charAt(i-1) == ' ') {
    			toUpperCase  = s.charAt(i)+"";
    			capitalizeString += toUpperCase.toUpperCase();
    		 } else {
    			 capitalizeString += toLowerCase.charAt(i);
    		 }
    	 }
         return capitalizeString;
    }
    public static String formalizeString (String s) {
        String formalizeString = "";
        s = s.trim();
        String [] arrayString = s.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals("")){
                continue;
            } else {
                formalizeString += arrayString[i].trim() + " ";
            }
        }
        return formalizeString;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        String fullName;
        System.out.print ("Entering full name: ");
        fullName = sc.nextLine();
        System.out.println ("The number words in string name " + fullName + " is: " + countWords(fullName));
        System.out.println ("The first name in string name " + fullName + " is: " + firstName(fullName));
        System.out.println ("The last name in string name " + fullName + " is: " + lastName(fullName));
        System.out.println ("The middle name in string name " + fullName + " is: " +  middleName(fullName));
        System.out.print ("Entering full name to capitalize: ");
        fullName = sc.nextLine();
        System.out.println ("The string namme " + fullName + " after capitalize is: " + capitalizeFirstCharacter(fullName));
        System.out.print ("Entering full name to formalize: ");
        fullName = sc.nextLine();
        System.out.println ("The string namme " + fullName + " after formalize is: " + formalizeString(fullName).trim);
    }
}