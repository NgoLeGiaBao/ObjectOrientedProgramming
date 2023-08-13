public class Employee extends Person {
    private String id;
    private double salary;

    public Employee (String name, int birthyear, String id, double salary) {
        super (name, birthyear);
        this.id = id;
        this.salary = salary;
    }
    public String getID (){
        return this.id;
    }
    public void setID (String id) {
        this.id = id;
    }
    public double getSalary () {
        return this.salary;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public String toString () {
        return "Employee[" + this.name + "-" + this.birthyear + "-" + this.id + "-" + this.salary + "]";
    }
}