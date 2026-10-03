package zad13Interfejs;

public class Discord implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Discord: " + wiadomosc);
    }
}
