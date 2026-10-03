package kolos3;

public class Test {
    public static void main(String[] args) {
        Użytkownik użytkownik = new Użytkownik(new Email());
        Użytkownik użytkownik1 = new Użytkownik(new Discord());
        użytkownik1.powiadomOModernizacji("Elo");
        użytkownik.powiadomOModernizacji("Elo");
    }
}
