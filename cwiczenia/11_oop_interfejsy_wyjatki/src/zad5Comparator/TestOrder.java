package zad5Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOrder {
    public static void main(String[] args) {
        ArrayList<Order> ListOrder = new ArrayList<>();
        ListOrder.add(new Order(1, "Dawid", LocalDate.of(20,2,2)));
        ListOrder.add(new Order(3, "Dawid", LocalDate.of(20,2,2)));
        ListOrder.add(new Order(2, "Dawid", LocalDate.of(20,2,2)));
        ListOrder.add(new Order(1, "Dawid", LocalDate.of(20,2,2)));
        System.out.println(ListOrder);

        ListOrder.sort(new OrderDateComparator());

        System.out.println(ListOrder);
    }
}
