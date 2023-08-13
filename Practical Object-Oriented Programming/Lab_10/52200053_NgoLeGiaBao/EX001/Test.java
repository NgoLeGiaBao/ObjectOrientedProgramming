public class Test {
    public static void main (String [] args){
        // Student 1
        Student st1 = new Student ("Tom Dean", "HCM", "Male", 10);
        Student.StudentOperator sto1 = st1.new StudentOperator();
        System.out.println ("The information of student 1");
        sto1.print();
        System.out.println ("Type of student is: " + sto1.type());

        // Student 2
        Student st2 = new Student ("Mc Philip", "HaNoi", "Female", 4);
        Student.StudentOperator sto2 = st2.new StudentOperator();
        System.out.println ("The information of student 2");
        sto2.print();
        System.out.println ("Type of student is: " + sto2.type());

        // Student 3
        Student st3 = new Student ("Mary", "DaNang", "Female", 6);
        Student.StudentOperator sto3 = st3.new StudentOperator();
        System.out.println ("The information of student 3");
        sto3.print();
        System.out.println ("Type of student is: " + sto3.type());
    }
}