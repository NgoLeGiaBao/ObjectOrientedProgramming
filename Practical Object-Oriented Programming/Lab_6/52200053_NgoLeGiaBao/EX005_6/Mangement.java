public class Mangement extends Employee{
    private String position;
    private double salaryCoefficientPosition;

    public Mangement () {
        super();
        this.position = "Head of the administrative office";
        this.salaryCoefficient = 5;
    }
    public Mangement (String ID, String fullName, double salaryCoefficient, String position, double salaryCoefficientPosition) {
        super (ID, fullName, salaryCoefficient);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }
    public Mangement (String ID, String fullName, int yearJonied, double salaryCoefficient, int numberDaysOff, String position, double salaryCoefficientPosition) {
        super (ID, fullName, yearJonied, salaryCoefficient, numberDaysOff);
        this.numberDaysOff =  numberDaysOff;
        this.salaryCoefficientPosition = salaryCoefficient;
    }
     public String considerEmulation () {
        return "A";
    }
    public double bonusByPosition() {
        return this.basicSalary * this.salaryCoefficientPosition;
    }
    public double getSalary () {
        return super.getSalary() + this.bonusByPosition();
    }
}