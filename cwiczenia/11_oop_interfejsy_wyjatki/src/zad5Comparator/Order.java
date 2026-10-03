package zad5Comparator;

import java.time.LocalDate;
import java.util.Comparator;


public class Order {
    int id;
    String customerName;
    LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}' + "\n";
    }
}

class OrderDateComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.orderDate.compareTo(o2.orderDate)== 0)
        {
            return Integer.compare(o1.id, o2.id);
        }
        return o1.orderDate.compareTo(o2.orderDate);
    }
}


