package zad6;

public class Samochód {
    private Silnik s1;

    public Samochód(Silnik s1) {
        this.s1 = s1;
    }

    void Start(){
        s1.uruchom();
    }
    void Stop(){
        s1.zatrzymaj();
    }

}
