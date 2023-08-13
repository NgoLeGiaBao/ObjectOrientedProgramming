public class MathStudent extends Student {
    private String sID;
    public MathStudent (String sName, double gpa, String sID) {
        super (sName, gpa);
        this.sID = sID;
    }
    public String getRank () {
        return gpa >= 5 ? "Passed":"Failed";
    }
    public String toString () {
        return "MathStudent[" + this.sName + "/" + this.gpa + "/" + this.sID + "/" + this.getRank()+"]";
    }
}