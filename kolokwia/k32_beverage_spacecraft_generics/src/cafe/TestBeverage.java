package cafe;

import java.util.ArrayList;

public class TestBeverage {
    public static void main(String[] args) {
        ArrayList<Beverage> b1 = new ArrayList<>();
        b1.add(new Beverage("Dawid", "1", 20));
        b1.add(new Beverage("Aawid", "1", 20));
        b1.add(new Beverage("Eawid", "1", 20));
        b1.add(new Beverage("Cawid", "1", 20));
        b1.add(new Beverage("Bawid", "1", 20));

        b1.sort(new StrengthNameComparator());
        System.out.println(b1);
    }
}
