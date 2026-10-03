package zad6;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Uruchamiam benzyniaka");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymuje benzyniaka");
    }
}
