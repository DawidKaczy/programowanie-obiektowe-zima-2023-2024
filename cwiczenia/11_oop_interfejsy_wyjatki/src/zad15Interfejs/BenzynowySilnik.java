package zad15Interfejs;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Uruchamaiam benzyniaka");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymuje benzyniaka");
    }
}
