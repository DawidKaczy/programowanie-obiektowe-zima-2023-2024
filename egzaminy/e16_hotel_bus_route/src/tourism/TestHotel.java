package tourism;

public class TestHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Duży", -200.0);
        Hotel h2 = new Hotel("Duży", 200.0);
        System.out.println(h1);
        System.out.println(h2);
        Hotel h3 = h1.clone();
        h3.name = "Duży v2";
        System.out.println(h3);

    }
}
