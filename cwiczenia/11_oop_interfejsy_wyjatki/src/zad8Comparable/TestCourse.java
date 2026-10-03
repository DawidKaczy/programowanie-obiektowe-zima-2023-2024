package zad8Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestCourse {
    public static void main(String[] args) {
        ArrayList<Course> c1 = new ArrayList<>();
        c1.add(new Course("Dawid", 0, 30.0));
        c1.add(new Course("Dawid", 0, 40.0));
        c1.add(new Course("Dawid", 0, 30.0));
        c1.add(new Course("Dawid", 0, 50.0));

        System.out.println(c1);
        Collections.sort(c1);
        System.out.println(c1);
    }
}
