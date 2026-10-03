package zad13InterfejsV2;

public class InfoMessage implements MessageWindow{
    @Override
    public void display() {
        System.out.println("Ok");
    }
}
