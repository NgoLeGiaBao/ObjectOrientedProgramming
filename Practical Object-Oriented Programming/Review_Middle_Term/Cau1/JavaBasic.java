public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        int sumNegative = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sumNegative += a[i];
            }
        }
        return sumNegative;
    }

    public static String uppercaseFirstVowels(String str){
        String newString = "";
        if ((str.charAt(0) == 'a')||(str.charAt(0) == 'o')||(str.charAt(0) == 'u')||(str.charAt(0) == 'e')||(str.charAt(0) == 'i')){
            newString += (str.charAt(0)+"").toUpperCase();
        } else {
            newString += str.charAt(0);
        }
        
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i-1) == ' ') && ((str.charAt(i) == 'a')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u')||(str.charAt(i) == 'e')||(str.charAt(i) == 'i'))) {
                
                newString += (str.charAt(i)+"").toUpperCase();
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
	
	public static int findMinNegativeElement(int a[]){
        int min = a[0];
        int position = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                position = i;
            }
        }
        return position;
    }
	
	public static String getName(String str){
       return str.substring (8);
    }

    public static int findFirstMod3Element(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int countString(String str, String k){
        int count = 0;
        String [] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase(k))
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int [] a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        System.out.println(sumNegativeElements(a));
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
        System.out.println (uppercaseFirstVowels(s));
        System.out.println (findMinNegativeElement(a));
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		System.out.println (getName(s1));
        System.out.println (findFirstMod3Element(a));
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh Phuong";
		System.out.println(countString(s2, "Phuong"));
    }

}