package kolos3;

public class Discord implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Discord " + wiadomość);
    }
}
