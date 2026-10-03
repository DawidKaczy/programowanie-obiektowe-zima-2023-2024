package university;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("Dawid", 3.1, 2));
        s1.add(new Student("Dawid", 3.1, 3));
        s1.add(new Student("Dawid", 3.1, 1));
        s1.add(new Student("Dawid", 3.1, 4));

        Collections.sort(s1);
        System.out.println(s1);

    }
}
