package zad5;

public class Biuro {
    private Printer p1;

    public Biuro(Printer p1) {
        this.p1 = p1;
    }

    void drukujDokument(String tekst)
    {
        p1.drukuj(tekst);
    }
}
