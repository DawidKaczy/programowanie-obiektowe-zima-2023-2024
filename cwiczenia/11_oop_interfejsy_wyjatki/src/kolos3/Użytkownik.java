package kolos3;

public class Użytkownik {
    private Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    void powiadomOModernizacji(String informacja)
    {
        powiadomienie.wyślij(informacja);
    }
}
