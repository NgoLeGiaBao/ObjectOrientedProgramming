import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class UpperCase {
    public static void readDataFromFile (String fileRead, String fileWrite) {
        String data = "";
        try {
            File myObj = new File (fileRead);
            Scanner myReader = new Scanner (myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println ("An error occurred.");
            e.printStackTrace();
        }
        writeDateIntoFile(fileWrite, data.toUpperCase());
    }
    public static void writeDateIntoFile (String fileWrite, String data) {
        try {
            FileWriter myWriter = new FileWriter(fileWrite);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main (String [] args) {
        readDataFromFile ("input.txt", "output.txt");
    }

}