public class ITStudent extends Student {
    private int sID;
    public ITStudent (String sName, double gpa, int sID) {
        super (sName, gpa);
        this.sID = sID;
    }
    public String getRank () {
        if (gpa <= 5)
            return "C";
        if (gpa <= 8)
            return "B";
        return "A";
    }
    public String toString () {
        return "ITStudent[" + this.sName + "/" + this.gpa + "/" + this.sID + "/" + this.getRank()+"]";
    }
}