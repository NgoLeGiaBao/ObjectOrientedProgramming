public class Test {
    public static void main (String [] args) {
        Employee epl1 = new Employee();
        Employee epl2 = new Employee ("52200053", "NgoLeGiaBao", 2017, 1.5, 1);
        Mangement mgm1 = new Mangement ("52200053", "NgoLeGiaBao", 2017, 1.5, 5, "D", 2);
        System.out.println (epl1.getSenioritySalary());
        System.out.println (epl1.considerEmulation());
        System.out.println (epl2.getSalary());
        System.out.println (mgm1.getSalary());
    }
}