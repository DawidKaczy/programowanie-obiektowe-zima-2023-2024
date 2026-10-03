package zad2_comparable_car;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> tab = new ArrayList<Car>();
        Car c1 = new Car("Opel", 2000, 2010);
        Car c2 = new Car("Mazda", 20000, 2012);
        Car c3 = new Car("Mercedes", 1500, 2020);
        tab.add(c1);
        tab.add(c2);
        tab.add(c3);
    }
}
