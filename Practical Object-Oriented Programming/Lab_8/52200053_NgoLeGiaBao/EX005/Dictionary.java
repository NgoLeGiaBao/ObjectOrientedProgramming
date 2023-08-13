import java.util.*;
public class Dictionary {
    public boolean checkWordExistInDictionary (HashMap <String, String> dictionary, String wordCheck) {
        return dictionary.containsKey (wordCheck);
    }
    public String findMeanOfWord (HashMap <String, String> dictionary, String wordFind) {
        return dictionary.get(wordFind);
    }
    public static void main (String[] args) {
        Dictionary dc = new Dictionary();
        Scanner sc = new Scanner (System.in);

        HashMap <String,String> dictionary = new HashMap <String,String> ();
        dictionary.put("Dictionary", "Từ điển");
        dictionary.put ("Time", "Thời gian");
        dictionary.put("Novel", "Tiểu thuyết");
        dictionary.put ("Distance", "Khoảng cách");
        dictionary.put("Computer", "Máy tính");
        dictionary.put ("Lake", "Cái hồ");
        dictionary.put("System", "Hệ thống");
        dictionary.put ("Happy", "Hạnh phúc");
        dictionary.put("Great", "Tuyệt vời");
        dictionary.put ("Grammar", "Ngữ pháp");

        for (String i : dictionary.keySet()) {
            System.out.println("Key: " + i + "/Value: " + dictionary.get(i));
        }

        String findWord;
        System.out.print ("Enter key check exist or not from the keyboard: ");
        findWord = sc.nextLine();
        System.out.println (findWord + " is exist in dictionary is " +  dc.checkWordExistInDictionary(dictionary, findWord));
        System.out.print ("Enter key to find meaning this word from the keyboard: ");
        findWord = sc.nextLine();  
        System.out.println ("Meaning of " + findWord + " is: " + dc.findMeanOfWord(dictionary,findWord));
    }
}