package zad15Interfejs;

public class Samochód {
    private Silnik s1;

    public Samochód(Silnik s1) {
        this.s1 = s1;
    }

    void start(){
        s1.uruchom();
    }

    void stop(){
        s1.zatrzymaj();
    }

}
