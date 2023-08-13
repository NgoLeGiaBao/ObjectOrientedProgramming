import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
public class ReadIntegerAndWriteSum {
    public static String [] readData (String nameFileRead) {
        String data = "";
        try {
            File fileRead = new File (nameFileRead);
            Scanner myReader = new Scanner (fileRead);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + " ";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println ("An error occurred");
            e.printStackTrace();
        }
        data = data.trim();
        String [] arrData = data.split(" ");
        return arrData; 
    }
    public static void writeData (String nameFileWrite, int sum) {
        try {
            PrintWriter pw = new PrintWriter (nameFileWrite);
            pw.write (sum+"");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    public static void main (String [] args) {
        String [] arrData = readData("input.txt");
        int sum = 0;
        for (String a : arrData) {
            sum += Integer.valueOf(a);
        }
        writeData ("output.txt", sum);
    }    
}