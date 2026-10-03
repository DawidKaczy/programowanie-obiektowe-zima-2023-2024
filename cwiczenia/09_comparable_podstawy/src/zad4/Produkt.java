// interfejs Comparable

package zad4;

import java.time.LocalDate;

public class Produkt implements Comparable<Produkt> {
    String nazwa;
    Double cena;
    LocalDate dataProdukcji;

    public Produkt(String nazwa, Double cena, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataProdukcji = dataProdukcji;
    }

    @Override
    public String toString() {
        return   nazwa +" "+  cena +" "+  dataProdukcji +"\n";
    }

    @Override
    public int compareTo(Produkt o) {
        return o.dataProdukcji.compareTo(this.dataProdukcji);
    }
}
