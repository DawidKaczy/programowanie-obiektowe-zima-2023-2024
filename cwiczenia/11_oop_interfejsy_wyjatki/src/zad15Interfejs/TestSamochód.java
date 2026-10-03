package zad15Interfejs;

public class TestSamochód {
    public static void main(String[] args) {
        Samochód s1 = new Samochód(new BenzynowySilnik());
        s1.start();
        s1.stop();
    }
}
