import java.io.*;
public class Student implements Serializable  {
    private String sName;
    private String sID;
    private double gpa;
    public Student (String sName, String sID, double gpa) {
        this.sName = sName;
        this.sID = sID;
        this.gpa = gpa;
    }
    public String toString () {
        return this.sName + " - " + this.sID + " - " + this.gpa;
    }
}