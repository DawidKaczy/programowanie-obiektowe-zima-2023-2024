package utilities;

import java.util.ArrayList;

import static utilities.GenericCountLessThanOrEqual.countLessThanOrEqual;

public class TestPerson {
    public static void main(String[] args) {
        Person[] p1 = {new Person("Dawid", 22), new Person("Dawid", 23)};

        Person p2 = new Person("Dawid", 22);


        System.out.println(countLessThanOrEqual(p1, p2));
    }
}
