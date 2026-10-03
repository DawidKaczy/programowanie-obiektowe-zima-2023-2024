package zad3;

public class WindowDisplay {
    private MessageWindow okno;

    public WindowDisplay(MessageWindow okno) {
        this.okno = okno;
    }

    void showWindow(){
        okno.display();
    }
}
