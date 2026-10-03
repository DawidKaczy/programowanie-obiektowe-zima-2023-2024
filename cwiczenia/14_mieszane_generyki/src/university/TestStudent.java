package university;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student("Dawid", 2.0 , 2));
        a1.add(new Student("Dawid2", 2.0 , 1));
        a1.add(new Student("Dawid3", 2.0 , 4));
        a1.add(new Student("Dawid4", 2.0 , 3));

        Collections.sort(a1);
        System.out.println(a1);
    }
}
