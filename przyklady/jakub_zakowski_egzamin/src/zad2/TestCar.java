package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(new Car("a", 15000, 1999),
                new Car("b", 20000, 1999),
                new Car("c", 15000, 2001)));
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println("\n");
        System.out.println(cars);
    }
}
