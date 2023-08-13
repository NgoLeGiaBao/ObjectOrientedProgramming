import java.util.*;
public class FindArrayList {
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList <Student> goodStudent = new ArrayList <Student> ();
        for (Student st : lstStu) {
            if (st.getRank().equals("A") || st.getRank().equals("Passed")) {
                goodStudent.add(st);
            }
        }
        return goodStudent;
    }
    public static void main (String [] args) {
        FindArrayList fal = new FindArrayList ();
        
        ArrayList <Student> listStudent = new ArrayList <Student> ();
        Student st1 = new ITStudent ("TomDean", 9, 1009);
        Student st2 = new MathStudent ("Jack", 3, "1008");
        Student st3 = new MathStudent ("Mari", 6, "1010");
        Student st4 = new ITStudent ("Jack", 7, 1000);

        listStudent.add(st1);
        listStudent.add (st2);
        listStudent.add(st3);
        listStudent.add (st4);
        
        System.out.println ("List good students are:");
        for (Student st : fal.findStudent(listStudent)) {
            System.out.println (st);
        }
    }
}