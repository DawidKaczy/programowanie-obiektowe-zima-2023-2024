package zad14Interfejs;

public class TestPowiadomienie {
    public static void main(String[] args) {
        Użytkownik u1 = new Użytkownik(new Discord());
        Użytkownik u2 = new Użytkownik(new Email());
        u1.powiadomOModernizacji("ELOOO");
        u2.powiadomOModernizacji("Też eloo");
    }
}
