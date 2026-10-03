package zad3;

public class ErrorMessage implements MessageWindow{
    @Override
    public void display() {
        System.out.println("Błąd\n[Retry] [Ignore] [Abort]");
    }
}
