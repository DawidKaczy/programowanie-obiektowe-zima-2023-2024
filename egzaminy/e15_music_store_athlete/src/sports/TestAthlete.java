package sports;

import java.util.ArrayList;
import java.util.Collections;

public class TestAthlete {
    public static void main(String[] args) {
        ArrayList<Athlete> a1 = new ArrayList<>();
        a1.add(new Athlete("Dawid", "Piłka", 2002));
        a1.add(new Athlete("Dawid", "Piłka", 2001));
        a1.add(new Athlete("Dawid", "Piłka", 1999));
        a1.add(new Athlete("Dawid", "Piłka", 2003));

        Collections.sort(a1);
        System.out.println(a1);


    }
}
