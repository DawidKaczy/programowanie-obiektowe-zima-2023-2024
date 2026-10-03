package zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestPracownik {
    public static void main(String[] args) {
        ArrayList<Pracownik>listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik("1", 2000.00, LocalDate.of(2002,10,11)));
        listaPracownikow.add(new Pracownik("3", 2500.00, LocalDate.of(2002,10,11)));
        listaPracownikow.add(new Pracownik("2", 2100.00, LocalDate.of(2002,10,11)));
        listaPracownikow.add(new Pracownik("3", 1500.00, LocalDate.of(2002,10,11)));
        listaPracownikow.add(new Pracownik("5", 1800.00, LocalDate.of(2002,10,11)));

        System.out.println(listaPracownikow);
        Collections.sort(listaPracownikow);
        System.out.println(listaPracownikow);

    }
}
