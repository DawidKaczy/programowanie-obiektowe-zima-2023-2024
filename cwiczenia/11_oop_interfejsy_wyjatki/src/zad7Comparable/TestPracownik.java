package zad7Comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestPracownik {
    public static void main(String[] args) {
        ArrayList<Pracownik>p1 = new ArrayList<>();
        p1.add(new Pracownik("Dawid", 20.0, LocalDate.of(2002,10,2)));
        p1.add(new Pracownik("Dawid", 40.0, LocalDate.of(2002,10,2)));
        p1.add(new Pracownik("Dawid", 30.0, LocalDate.of(2002,10,2)));
        p1.add(new Pracownik("Dawid", 20.0, LocalDate.of(2002,10,2)));
        System.out.println(p1);
        Collections.sort(p1);
        System.out.println(p1);

    }
}
