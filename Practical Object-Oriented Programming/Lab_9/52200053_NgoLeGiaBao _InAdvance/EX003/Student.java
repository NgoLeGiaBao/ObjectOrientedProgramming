import java.io.*;
public class Student  {
    private String sName;
    private String sID;
    private double gpa;
    public Student (String sName, String sID, double gpa) {
        this.sName = sName;
        this.sID = sID;
        this.gpa = gpa;
    }
    public String getSName () {
        return this.sName;
    } 
    public void setSName (String sName) {
        this.sName = sName;
    }
    public String getSID () {
        return this.sID;
    }
    public void setSID (String sID) {
        this.sID = sID;
    }
    public double getGPA () {
        return this.gpa;
    }
    public void setGPA (double gpa) {
        this.gpa = gpa;
    }
    public String toString () {
        return this.sName + " - " + this.sID + " - " + this.gpa;
    }
}