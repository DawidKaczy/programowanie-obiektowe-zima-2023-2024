package zad14Interfejs;

public class Użytkownik {
    private Powiadomienie p1;

    public Użytkownik(Powiadomienie p1) {
        this.p1 = p1;
    }

    void powiadomOModernizacji(String informacja)
    {
        p1.wyślij(informacja);
    }
}
