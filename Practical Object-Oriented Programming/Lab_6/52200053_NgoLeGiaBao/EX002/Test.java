public class Test {
    public static void main (String [] args) {
        Person p1 = new Person("Nguyen Thien Phuc", "Quan 7");
        Student std1 = new Student("England", "Tom Dean", "CLC", 2022, 2000);
        Staff sf1 = new Staff("USA", "Kinna", "TDTU", 3000);

        System.out.println(p1);
        System.out.println(std1);
        System.out.println(sf1);
    }
}