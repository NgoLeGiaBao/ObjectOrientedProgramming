import java.util.ArrayList;
public class PersonModel <T> {
    private ArrayList <T> al = new ArrayList<T>();
    public void addS (T obj) {
        al.add(obj);
    }
    public void display () {
        for (T obj : al) {
            System.out.println (obj);
        }
    }
    public static void main (String [] args) {
        PersonModel <Person> pm1 = new PersonModel();
        Person p1 = new Person ("Jack", 2004);
        Person p2 = new Person ("Tom Dean", 2000);
        pm1.addS(p1);
        pm1.addS(p2);
        pm1.display();

        PersonModel <Student> pm2 = new PersonModel ();
        Student st1 = new Student ("Mc Tom", 1999,"522", 10);
        Student st2 = new Student ("Dean", 2000, "523", 9);
        pm2.addS(st1);
        pm2.addS(st2);
        pm2.display();

        PersonModel <Employee> pm3 = new PersonModel();
        Employee emp1 = new Employee ("Jack Grealist", 1998,"524", 50000);
        Employee emp2 = new Employee ("LinkWord", 2003, "525", 25000);
        pm3.addS(emp1);
        pm3.addS(emp2);
        pm3.display();
    }
}