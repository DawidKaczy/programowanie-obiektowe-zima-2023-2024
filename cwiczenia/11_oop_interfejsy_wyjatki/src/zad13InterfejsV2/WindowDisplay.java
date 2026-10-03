package zad13InterfejsV2;

public class WindowDisplay {
    public MessageWindow okno;

    public WindowDisplay(MessageWindow okno) {
        this.okno = okno;
    }
    void showWindow(){
        okno.display();
    }
}
