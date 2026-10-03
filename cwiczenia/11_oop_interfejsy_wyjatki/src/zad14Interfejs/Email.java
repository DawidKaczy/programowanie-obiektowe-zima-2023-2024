package zad14Interfejs;

public class Email implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Email "+ wiadomość);
    }
}
