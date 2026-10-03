package cinema;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie {
    public static void main(String[] args) {
        ArrayList<Movie> a1 = new ArrayList<>();
        a1.add(new Movie("B", "ok", "ok"));
        a1.add(new Movie("A", "ok", "ok"));
        a1.add(new Movie("D", "ok", "ok"));
        a1.add(new Movie("E", "ok", "ok"));

        Collections.sort(a1);
        System.out.println(a1);

    }

}
