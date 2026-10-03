package zad3;

public class TestMessageWindow {
    public static void main(String[] args) {
        WindowDisplay w1 = new WindowDisplay(new ErrorMessage());
        WindowDisplay w2 = new WindowDisplay(new InfoMessage());
        w1.showWindow();
        System.out.println();
        w2.showWindow();
    }
}
