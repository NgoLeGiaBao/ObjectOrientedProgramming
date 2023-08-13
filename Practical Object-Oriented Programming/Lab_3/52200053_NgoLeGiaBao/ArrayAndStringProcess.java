import java.util.Scanner;
public class ArrayAndStringProcess {
    // EX001
	public static boolean removeFirstElement (int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				for (int j = i; j < arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				return true;
			}
		}
		return false;
	}
	public static int[] insertElement (int arr[], int element, int position) {
		int [] newArr = new int [arr.length];
		int h = arr.length - 1;
		for (int i = arr.length - 1; i > position; i--) {
			newArr[h--] = arr[i-1];
		}
		newArr[position] = element;
		h = 0;
		for (int i = 0; i < position; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	public static int[] findDuplicate (int arr[]) {
		int count = 0;
		int count_duplicate = 0;
		int f = 0;
		int h = 0;
		int [] numberDuplicate = new int [arr.length];
		int [] newArray = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) {
			boolean result = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == newArray[j]) {
					numberDuplicate[h++] = arr[i];
					count_duplicate++;
					result = true;
					break;
				}

			}
			if (result == false) {
				newArray[f++] = arr[i];
				count++;
			}
		}
		int [] arr_result = new int [count_duplicate];
		for (int i = 0; i < count_duplicate; i++) {
			arr_result[i] = numberDuplicate[i];
		}
		return arr_result;
	}
	public static int[] removeDuplicate (int arr[]) {
		int count = 0;
		int f = 0;
		int h = 0;
		int [] numberDuplicate = new int [arr.length];
		int [] newArray = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) {
			boolean result = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == newArray[j]) {
					numberDuplicate[h++] = arr[i];
					result = true;
					break;
				}

			}
			if (result == false) {
				newArray[f++] = arr[i];
				count++;
			}
		}
		int [] arr_result = new int [count];
		for (int i = 0; i < count; i++) {
			arr_result[i] = newArray[i];
		}
		return arr_result;
	}
    // EX002
    public static int[][] addBetweenTwoArr (int arr1[][], int arr2[][]) {
        int[][] arrAdd = new int [arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arrAdd[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arrAdd;
    }
    public static int[][] multiplyANumberWithArray (int arr1[][], int n) {
        int[][] arrAdd = new int [arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arrAdd[i][j] = arr1[i][j] * n;
            }
        }
        return arrAdd;
    }
    public static void printFormat (int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // EX003
    public static String getFirstAndLastName (String s) {
        int firstPositon = s.indexOf(" ");
        int lastPosition = s.lastIndexOf(" ");
        return s.substring(0, firstPositon) + " " + s.substring(lastPosition+1);
    }
    public static String getMiddleName (String s) {
        int firstPositon = s.indexOf(" ");
        int lastPosition = s.lastIndexOf(" ");
        return s.substring(firstPositon+1, lastPosition);
    }
    public static String capitalize (String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                s1 += (s.charAt(i)+"").toUpperCase();
            } else if (s.charAt(i-1) == ' ') {
                s1 += (s.charAt(i)+"").toUpperCase();
            } else {
                s1 += s.charAt(i);
            }
        }
        return s1;
    }
    public static String upperVowelsAndLowerAllConsonants (String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o') {
                s1 += (s.charAt(i)+"").toUpperCase();
            } else {
                s1 += (s.charAt(i)+"").toLowerCase();
            }
        }
        return s1;
    }


    // EX004
    public static int lenString (String s) {
        return s.length();
    }
    public static int countWord (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
    public static String concatenate (String s1, String s2) {
        return s1 + " " + s2;
    }
    public static boolean checkPalindrome (String s) {
        String s1 = "";
        for (int i = s.length()-1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        if (s.equals(s1)) {
            return true;
        }
        return false;
    }
    
    // EX005
    public static String [][] countTimesAWordApperarInParagraph (String paragraph) {
        int count = 0;
        int h = 0;
        String [] word = paragraph.split("\\,|\\.|\\s+");
        String [] newWord = new String [word.length];
        int [] repeatTime = new int [word.length];
        for (int i = 0; i < word.length; i++) {
        	boolean result = false;
        	for (int j = 0; j < count; j++) {
        		if (word[i].equalsIgnoreCase(newWord[j])) {
        			repeatTime[j]++;
        			result = true;
        			break;
        		}
        		
        	}
        	if (result == false) {
        		newWord[h] = word[i];
        		repeatTime[h]++;
        		h++;
        		count++;
        	}
        }
        for (int i = 0; i < count; i++) {
        	if (newWord[i].equals("") )  {
        		continue;
        	}
        }
       String arrCharacter [][] = new String[count][2];
       for (int i = 0; i < count; i++) {
    	   for (int j = 0; j < 2; j++) {
    		   if (j == 0) {
    			  arrCharacter[i][j] = newWord[i];
    		   } else {
    			   arrCharacter[i][j] = Integer.toString(repeatTime[i]);
    		   }
    	   }
       }
       return arrCharacter;
    }
    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        // EX001
        int [] arr_1 = {5,9,2,1,6,9};
        System.out.println("Element removed is: " + removeFirstElement(arr_1, 8));
        System.out.print("Array after delete element is: ");
        if (removeFirstElement(arr_1, 8) == true) {
            int [] arr_1_new = new int [arr_1.length-1]; 
            for (int i = 0; i < arr_1_new.length; i++) {
            	arr_1_new [i] = arr_1[i];
            }
            for (int i : arr_1_new) {
    			System.out.print(i + " ");
    		}
        } else {
        	for (int i : arr_1) {
				System.out.print(i + " ");
			}
        }
        System.out.println();
        

        int [] arr_2 = {1,2,4,3};
        System.out.print("Array after insert element is: "); {
        	for (int i : insertElement(arr_2, 5, 2)) {
				System.out.print(i + " ");
			}
        }
        System.out.println();
        
        int [] arr_3_1 = {1,3,1,3,2,4};
        System.out.print("Numbers are duplicate number: ");
        for (int i : findDuplicate(arr_3_1)) {
			System.out.print(i + " ");
		}
        System.out.println();
        System.out.print("Array after remove duplicate is: ");
        for (int i : removeDuplicate(arr_3_1)) {
    	   System.out.print(i + " ");
       }
        
        
        // EX002
        int [][] arr_3 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr_4 = {{9,8,7},{6,5,4},{3,2,1}};
        
        int [][] arr_total = addBetweenTwoArr(arr_3, arr_4);
        System.out.println("A new array is created after add between two array is: ");
        for (int i = 0; i < arr_total.length; i++) {
        	for (int j = 0; j < arr_total.length; j++) {
        		System.out.print(arr_total[i][j] + "\t");
        	}
        	System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        
        System.out.print("Entering a number to multiply with a matrix: ");
        n = sc.nextInt();
        int [][] arr_multiplyANumber = multiplyANumberWithArray(arr_3, n);
        System.out.println("A new array is created after multiply a number with a matrix is: ");
        for (int i = 0; i < arr_multiplyANumber.length; i++) {
        	for (int j = 0; j < arr_multiplyANumber.length; j++) {
        		System.out.print(arr_multiplyANumber[i][j] + "\t");
        	}
        	System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        sc.nextLine();
        
        // EX003
        String fullName;
        
        System.out.print("Entering the full name VietNamese to get first and last the full name: ");
        fullName = sc.nextLine();
        System.out.println("First and last name's " + fullName + " is: " + getFirstAndLastName(fullName));
        
        System.out.print("Entering the full name VietNamese to get middle the full name: ");
        fullName = sc.nextLine();
        System.out.println("Middle name's " + fullName + " is: " + getMiddleName(fullName));
       
        System.out.print("Entering the full name VietNamese to capitalize the full name: ");
        fullName = sc.nextLine();
        System.out.println("Capitalize " + fullName + " is: " + capitalize(fullName));
        
        System.out.print("Entering the full name VietNamese to uppercase all vowels and lowercase all consonants: ");
        fullName = sc.nextLine();
        System.out.println(fullName + " after uppercase all vowels and lowercase all consonants is: " + upperVowelsAndLowerAllConsonants(fullName));
        
        
        // EX004
        String nameString, otherNameString;
        
        System.out.print("Entering a string from the keyboard: ");
        nameString = sc.nextLine();
        System.out.println("A number of words in " + nameString + " is: " + countWord(nameString));
        System.out.println("The length of " + nameString + " is: " + lenString(nameString));
        System.out.print("Entering another string from the keyboard: ");
        otherNameString = sc.nextLine();
        System.out.println("The string " + nameString + " concatenates " + otherNameString + " creating the new string is: " + concatenate(nameString, otherNameString));
        System.out.println("The string " + nameString + " palindrome is: " + checkPalindrome(nameString));

        // EX005
        /*
        You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.
        */
        String paragraph;
        System.out.print("Entering paragraph from the key board: ");
        paragraph = sc.nextLine();
        String [][] twoDirection = countTimesAWordApperarInParagraph(paragraph);
        for (int i = 0; i < twoDirection.length; i++) {
        	if (twoDirection[i][0].equals("")) {
        		continue;
        	}
        	System.out.println("'" + twoDirection[i][0] + "'" + ":" + " " + twoDirection[i][1]);
        }
    }
}