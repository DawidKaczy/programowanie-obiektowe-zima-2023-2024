package zad13InterfejsV2;

public class ErrorMessage implements MessageWindow{
    @Override
    public void display() {
        System.out.println("Error");
    }
}
