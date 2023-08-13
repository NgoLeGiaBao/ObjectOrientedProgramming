public class Staff extends Person {
    private String school;
    private double pay;

    public Staff (String address, String name, String school, double pay) {
        super (address, name);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool () {
        return this.school;
    }
    public double getPay () {
        return this.pay;
    }
    public void setSchool (String school) {
        this.school = school;
    }
    public void setPay (double pay) {
        this.pay = pay;
    }
    public String toString () {
        return "Staff [" + this.name + " - " + this.address + " - " + this.school + " - " + this.pay + "]"; 
    }
}
