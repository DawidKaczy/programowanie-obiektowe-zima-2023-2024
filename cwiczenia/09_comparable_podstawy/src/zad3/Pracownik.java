// interfejs Comparable

package zad3;

import java.time.LocalDate;

public class Pracownik implements Comparable<Pracownik> {
    String imie;
    Double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, Double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return   imie + " " + pensja + " " + dataZatrudnienia + "\n";
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.pensja, o.pensja);
    }
}


