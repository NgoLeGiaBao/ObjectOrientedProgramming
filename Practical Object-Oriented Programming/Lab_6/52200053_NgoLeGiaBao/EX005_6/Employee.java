public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJonied;
    protected double salaryCoefficient;
    protected int numberDaysOff;
    protected double basicSalary;

    public Employee () {
        this.ID = "0";
        this.fullName = "";
        this.yearJonied = 2020;
        this.salaryCoefficient = 1;
        this.numberDaysOff = 0;
        this.basicSalary = 1150;
    }
    public Employee (String ID, String fullName, double salaryCoefficient) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJonied = 2020;
        this.salaryCoefficient = salaryCoefficient;
        this.numberDaysOff = 0;
         this.basicSalary = 1150;
    }
    public Employee (String ID, String fullName, int yearJonied, double salaryCoefficient, int numberDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJonied = yearJonied;
        this.salaryCoefficient = salaryCoefficient;
        this.numberDaysOff = numberDaysOff;
        this.basicSalary = 1150;
    }
    public double getSenioritySalary (){
        int yearOfWord = 2023 - this.yearJonied;
        if (yearOfWord >= 5) {
            return yearOfWord * (1150 / 100.0);
        }
        return 0;
    }
    public String considerEmulation () {
        if (numberDaysOff <= 1)
            return "A";
        if (numberDaysOff <= 3) 
            return "B";
        return "C";
    }
    public double getSalary (){
        double emulationCofficient;
        if (considerEmulation().equals("A")) {
            emulationCofficient = 1;
        } else if (considerEmulation().equals("B")) {
            emulationCofficient = 0.75;
        } else {
           emulationCofficient = 0.5;
        }
        return this.basicSalary  + (this.basicSalary * (this.salaryCoefficient + emulationCofficient)) + this.getSenioritySalary();
    }
}