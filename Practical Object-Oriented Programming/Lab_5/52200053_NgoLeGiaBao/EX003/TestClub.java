public class TestClub {
    public static void main (String [] args) {
        Club club_1 = new Club ();
        Club club_2 = new Club ("Asernal", 4, 5,2);
        Club club_3 = new Club ("Mu", 6,2,1);
        Club club_4 = new Club (club_2);

        club_1.setWins(10);
        club_1.setName("MC City");

        System.out.println (club_1);
        System.out.println (club_2);
        System.out.println (club_3);
        System.out.println (club_4);

        System.out.println (club_1.getPoints());
        System.out.println (club_2.getPoints());
        System.out.println (club_3.getPoints());
        System.out.println (club_4.getPoints());

        System.out.println (club_1.isFinish());
        System.out.println (club_2.isFinish());
        System.out.println (club_3.isFinish());
        System.out.println (club_4.isFinish());
    }
}