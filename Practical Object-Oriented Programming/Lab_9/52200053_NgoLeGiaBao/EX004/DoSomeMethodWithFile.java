import java.util.*;
import java.io.*;
public class DoSomeMethodWithFile {
    public static String [] filesFromFolder (File name) throws IllegalArgumentException {
        String [] listFile = null;
        if (name.isFile()) {
            throw new IllegalArgumentException ("This is not folder, " + name.getName() + " is file");
        } else {
            listFile = name.list();
        }
        return listFile;
    }
    public static boolean checkFileOrFolderExist (File name) {
        return name.exists();
    }
    public static boolean checkIsFileOrFolder (File name) {
        return name.isFile();
    }
    public static void writeDateIntoFile  (File name, String data) throws IllegalArgumentException{
        if (!name.exists() || !name.isFile()) {
            throw new IllegalArgumentException ("This file hasn't been created or this is folder");
        } else {
            try {
                FileWriter fw = new FileWriter (name);
                fw.write(data);
                fw.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println ("Couldn't write data");
            }
        }
    }
    public static String longestWordInAText (File name) throws IllegalArgumentException{
        String dataReadFromFile = "";
        if (!name.exists() || !name.isFile()) {
            throw new IllegalArgumentException ("This file hasn't been created or this is folder");
        } else {
            try {
                Scanner reader = new Scanner (name);
                while (reader.hasNextLine()) {
                    dataReadFromFile += reader.nextLine() + " ";
                }
            } catch (IOException e) {
                System.out.println ("Couldn't write data");
            }  
        }
        dataReadFromFile = dataReadFromFile.replace(",","");
        dataReadFromFile = dataReadFromFile.replace(".","");
        dataReadFromFile = dataReadFromFile.replace("()","");
        dataReadFromFile = dataReadFromFile.replace(":","");

        String [] dataWord = dataReadFromFile.split(" ");
        int longestWord = 0;
        for (int i = 0; i < dataWord.length; i++) {
            if (dataWord[i].length() > dataWord[longestWord].length()) {
                longestWord = i;
            }
        }
        return dataWord[longestWord];
    }
    public static void main (String [] args) {
        File nameF1 = new File ("OPP");
        File nameF2 = new File ("OPP\\EX1.txt");
        File nameF3 = new File ("OPP\\EX2.txt");
        File nameF4 = new File ("OPP\\EX3.txt");
        File nameF5 = new File ("OPP\\EX4.txt");
        File nameF6 = new File ("OPP\\EX5.txt");
        // Create folder and file
        nameF1.mkdir();
        try {
            nameF2.createNewFile();
            nameF3.createNewFile();
            nameF4.createNewFile();
            nameF5.createNewFile();
        } catch (IOException e) {
            System.out.println ("Can't create file");
        }
        // Print all files in a folder
        try {
            for (String name : filesFromFolder(nameF1)) {
                System.out.println(name);
            }
        } catch (IllegalArgumentException e) {
            System.out.println (e);
            e.printStackTrace();
        }
        // Check a folder or file is exist or not
        System.out.println (nameF1.getName() + " existing is: " + checkFileOrFolderExist(nameF1));
        System.out.println (nameF6.getName() + " existing is: " + checkFileOrFolderExist(nameF6));
        // Check it is folder or file
        if (checkIsFileOrFolder(nameF1)) {
            System.out.println ("This is file");
        } else {
            System.out.println ("This is folder");
        }
        // Write text into a file
        try {
            writeDateIntoFile (nameF2, "In the following example, we use the FileWriter class together with its write() method \nto write some text to the file we created in the example above\n. Note that when you are done writing to the file, you should close it with the close() method:");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        // Find the longest word in a file
        try {
            System.out.println(longestWordInAText(nameF2));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}