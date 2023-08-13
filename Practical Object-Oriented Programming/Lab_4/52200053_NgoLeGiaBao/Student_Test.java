public class Student_Test {
    public static void main (String [] args) {
        Student st1 = new Student(1, "Tien", "Tran");
        Student st2 = new Student(2, "Phuc", "Nguyen Thien");

        System.out.println("Name's first student is: " + st1.getName());
        System.out.println("Name's second student is: " + st2.getName());

        System.out.println("Information's first student is: " + st1);
        System.out.println("Information's second student is: " + st2);
    }
}