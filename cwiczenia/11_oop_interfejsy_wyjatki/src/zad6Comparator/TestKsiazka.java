package zad6Comparator;

import java.util.ArrayList;

public class TestKsiazka {
    public static void main(String[] args) {
        ArrayList<Ksiazka> k1 = new ArrayList<>();
        k1.add(new Ksiazka("Oskar i Pani", 20.0, 2002));
        k1.add(new Ksiazka("Oskar i Pani", 20.0, 2006));
        k1.add(new Ksiazka("Oskar i Pani", 20.0, 2003));
        k1.add(new Ksiazka("Oskar i Pani", 20.0, 2001));



        System.out.println(k1);
        k1.sort(new RokWydaniaComparator());
        System.out.println(k1);

    }
}
