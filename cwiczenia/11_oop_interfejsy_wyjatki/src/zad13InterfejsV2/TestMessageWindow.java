package zad13InterfejsV2;

public class TestMessageWindow {
    public static void main(String[] args) {
        WindowDisplay m1 = new WindowDisplay(new ErrorMessage());
        WindowDisplay m2 = new WindowDisplay(new InfoMessage());
        m1.showWindow();
        m2.showWindow();

    }
}
