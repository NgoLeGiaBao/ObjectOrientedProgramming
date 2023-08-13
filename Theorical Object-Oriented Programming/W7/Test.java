class Test {
    public static void main (String [] args) {
        Tivi tv1 = new Tivi("TV780", 41, "Hawie",12);
        TiviTM tvtm1 = new TiviTM();
        TiviTM tvtm2 = new TiviTM("TV456", 70, "Samsung", 100, 16, "5K");
        TiviTM tvtm3 = new TiviTM();

        System.out.println(tv1);
        System.out.println(tvtm1);
        System.out.println(tvtm2);
    }
}    