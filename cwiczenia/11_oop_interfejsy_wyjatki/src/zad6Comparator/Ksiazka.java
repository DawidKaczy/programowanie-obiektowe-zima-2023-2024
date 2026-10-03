package zad6Comparator;

import java.util.Comparator;

public class Ksiazka{
    String title;
    Double cena;
    int rokWydania;

    public Ksiazka(String title, Double cena, int rokWydania) {
        this.title = title;
        this.cena = cena;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "title='" + title + '\'' +
                ", cena=" + cena +
                ", rokWydania=" + rokWydania +
                '}' + "\n";
    }
}

class RokWydaniaComparator implements Comparator<Ksiazka>{

    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.rokWydania, o2.rokWydania);
    }
}
