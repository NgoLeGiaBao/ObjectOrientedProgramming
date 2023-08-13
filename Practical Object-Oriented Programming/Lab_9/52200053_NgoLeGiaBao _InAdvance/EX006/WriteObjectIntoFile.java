import java.util.*;
import java.io.*;
public class WriteObjectIntoFile<E> implements Serializable {
    private ArrayList <E> ls = new ArrayList();
    public boolean writeFile (String path, ArrayList<E> lst) {
        try {
            File fileName = new File (path);
            FileOutputStream os = new FileOutputStream (fileName);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (E obj : lst) {
                oos.writeObject (obj);
            }
            oos.flush();
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public void addElement (E obj) {
        this.ls.add(obj);   
    }
    public void printObj () {
        for (E listElemt: ls) {
            System.out.println (listElemt);
        }
    }
    public ArrayList<E> listData () {
        return this.ls;
    }
    public boolean readObject (String path) {
        try {
            File f = new File (path);
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (true) {
                Object obj = null;
                try {
                    obj = ois.readObject();
                } catch (EOFException e) {
                    break; // dừng vòng lặp khi đã đọc hết dữ liệu
                }
                System.out.println ((E)obj);
            }
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
    public static void main (String [] args) {
        WriteObjectIntoFile <Student> wf = new WriteObjectIntoFile();
        Student st1 = new Student ("303", "Tom", 10);
        Student st2 = new Student ("304", "Dean", 9.5);
        Student st3 = new Student ("305", "Jack", 8);
        Student st4 = new Student ("306", "John", 10);
        wf.addElement(st1);
        wf.addElement(st2);
        wf.addElement(st3);
        wf.addElement(st4);
    
        if(wf.writeFile("output.txt", wf.listData())){
            System.out.println ("Write data successfully!");
        } else {
            System.out.println ("Write data failure");
        }

        if(wf.readObject("output.txt")) {
            System.out.println ("Read data successfully!");
        } else {
            System.out.println ("Read data failure");
        }
    }
}