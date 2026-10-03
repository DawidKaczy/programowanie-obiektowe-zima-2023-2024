package zad6;

public class Main {
    public static void main(String[] args) {
        Silnik s1 = new BenzynowySilnik();
        Samochód s2 = new Samochód(s1);
        s2.Start();
        s2.Stop();
    }
}
