public class Student extends Person {
    private String id;
    private double score;

    public Student (String name, int birthyear, String id, double score) {
        super (name, birthyear);
        this.id = id;
        this.score = score;
    }
    public String getID (){
        return this.id;
    }
    public void setID (String id) {
        this.id = id;
    }
    public double getScore () {
        return this.score;
    }
    public void setScore (double score) {
        this.score = score;
    }
    public String toString () {
        return "Student[" + this.name + "-" + this.birthyear + "-" + this.id + "-" + this.score + "]";
    }
}