package zad13Interfejs;

public class TestPowiadomienie {
    public static void main(String[] args) {

        Uzytkownik u1 = new Uzytkownik(new Discord());
        Uzytkownik u2 = new Uzytkownik(new Email());
        u1.powiadomOModernizacji("Hej");
        u2.powiadomOModernizacji("Hejo");

    }





}
