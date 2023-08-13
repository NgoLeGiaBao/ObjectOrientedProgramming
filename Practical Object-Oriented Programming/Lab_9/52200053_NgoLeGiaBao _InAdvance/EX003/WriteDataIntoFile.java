import java.util.*;
import java.io.*;
public class WriteDataIntoFile <E> {
    private ArrayList <E> listData = new ArrayList <E> ();
    public ArrayList <E> getListData () {
        return this.listData;
    }
    public void setListData (ArrayList <E> listData) {
        this.listData = listData;
    }
    public <E> boolean writeFile(String path, ArrayList<E> lst) {
        String data = "";
        int i = 0;
        int sizeLst = lst.size();
        for (E obj : lst) {
            i++;
            if (i == sizeLst) {
                data += obj;
            } else {
                data += obj + "\n";
            }
        }
        try {
            FileWriter fw = new FileWriter (path);
            fw.write (data);
            fw.close ();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    public boolean writeDataNoOverride (String path, String data) {
        try {
            FileWriter fw = new FileWriter (path, true);
            fw.write (data);
            fw.close ();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    public boolean readFile (String path) {
        String data;
        String [] inforObj;
        try {
            File rf = new File (path);
            Scanner rd = new Scanner (rf);
            while (rd.hasNextLine()) {
                data = rd.nextLine();
                inforObj = data.split(" - ");
                E st = (E) new Student(inforObj[0], inforObj[1], Double.parseDouble(inforObj[2]));
                this.listData.add(st);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    public static void main (String [] args) {
        WriteDataIntoFile <Student> wfif = new WriteDataIntoFile();
        Student st0 = new Student ("302", "Bank", 7);
        // Student st1 = new Student ("303", "Tom", 10);
        // Student st2 = new Student ("304", "Dean", 9.5);
        // Student st3 = new Student ("305", "Jack", 6);
        // Student st4 = new Student ("306", "John", 3);
       
        wfif.getListData().add(st0);
        // wfif.getListData().add(st1);
        // wfif.getListData().add(st2);
        // wfif.getListData().add(st3);
        // wfif.getListData().add(st4);

        // System.out.println(wfif.writeFile("output.txt",wfif.getListData()));
        // System.out.println (wfif.readFile("output.txt"));
        // for (int i = 0; i < wfif.readFile("output.txt").length; i++) {
        //     System.out.println (wfif.readFile("output.txt")[i]);
        // }
        // System.out.println ("List student init");
        // for (Student st : wfif.getListData()) {
        //     System.out.println (st);
        // }
        // wfif.readFile("output.txt");
        // System.out.println ("List student after read from file");
        // for (Student st : wfif.getListData()) {
        //     System.out.println (st);
        // }
    }   
}