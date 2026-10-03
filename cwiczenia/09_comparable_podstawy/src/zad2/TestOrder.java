package zad2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {
        ArrayList<Order>o1 = new ArrayList<>();
        o1.add(new Order(1, "Dawid", LocalDate.of(2023,2,10)));
        o1.add(new Order(3, "Kasia", LocalDate.of(2023,2,10)));
        o1.add(new Order(2, "Kamil", LocalDate.of(2023,2,10)));
        o1.add(new Order(5, "Arek", LocalDate.of(2023,2,10)));
        o1.add(new Order(4, "Damin", LocalDate.of(2023,2,10)));

        System.out.println(o1.toString());
        o1.sort(new OrderDateComparator());
        System.out.println(o1);

    }
}
