package kolos2;

import java.util.ArrayList;
import java.util.Collections;

public class TestCourse {
    public static void main(String[] args) {

        ArrayList<Course> c1 = new ArrayList<>();
        c1.add(new Course("Dawid", 5, 20.0));
        c1.add(new Course("Dawid", 5, 250.0));
        c1.add(new Course("Dawid", 5, 50.0));
        c1.add(new Course("Dawid", 5, 50.0));
        c1.add(new Course("Dawid", 5, 300.0));

        System.out.println(c1);
        Collections.sort(c1);
        System.out.println(c1);
    }
}
