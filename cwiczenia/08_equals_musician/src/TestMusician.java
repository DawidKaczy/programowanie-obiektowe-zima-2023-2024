public class TestMusician {
    public static void main(String[] args) {
        Musician m1 = new Musician("Dawid", "Toshiba");
        Musician m2 = new Musician("Dawid", "Toshiba");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m1.equals(m2));
        System.out.println(m1.writeSong(5));

        Guitarist g1 = new Guitarist("Dawid", "Toshiba", "M2");
        Guitarist g2 = new Guitarist("Dawid", "Toshiba", "M2");
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g1.equals(g2));
        System.out.println(g1.writeSong());

    }
}
