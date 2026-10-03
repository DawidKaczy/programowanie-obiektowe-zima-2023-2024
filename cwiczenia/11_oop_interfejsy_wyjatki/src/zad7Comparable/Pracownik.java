package zad7Comparable;

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
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", pensja=" + pensja +
                ", dataZatrudnienia=" + dataZatrudnienia +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(pensja, o.pensja);
    }
}
