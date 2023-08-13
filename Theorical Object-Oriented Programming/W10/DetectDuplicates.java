import java.util.*;
public class DetectDuplicates {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        Random rd = new Random ();
        ArrayList <Integer> list = new ArrayList <Integer> ();

        int numUnique, limit, num;
        int countUnique = 0; 
		int countDuplicates = 0; 

        System.out.print ("Enter number of unique integers of generate: ");
        numUnique = sc.nextInt();
        System.out.print ("Enter limit: ");
        limit = sc.nextInt();
        while (list.size() <= numUnique){
            num = rd.nextInt(limit + 1);
            System.out.println(num);
            if (list.contains(num)) {
                countDuplicates++;
            } else {
                list.add(num);
            }
        }
        System.out.println ("List " + list);
        System.out.println ("Duplicates detected: " + countDuplicates);
    }   
}
