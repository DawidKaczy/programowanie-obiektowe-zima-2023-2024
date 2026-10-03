package zad4;

import zad4.Produkt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestProdukt {
    public static void main(String[] args) {
        ArrayList<Produkt>listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("Kubuś", 20.20, LocalDate.of(1999,10,10)));
        listaProduktow.add(new Produkt("Kubuś", 21.20, LocalDate.of(2020,10,10)));
        listaProduktow.add(new Produkt("Kubuś", 22.20, LocalDate.of(2018,10,10)));
        listaProduktow.add(new Produkt("Kubuś", 19.20, LocalDate.of(2015,10,10)));
        listaProduktow.add(new Produkt("Kubuś", 15.20, LocalDate.of(2008,10,10)));
        System.out.println(listaProduktow.toString());
        Collections.sort(listaProduktow);
        System.out.println(listaProduktow.toString());
    }
}
