package sports;

import java.util.ArrayList;

public class TestAthlete {
    public static void main(String[] args) {

        double[] tab = {3.0, 4.0, 3.0};
        double[] tab2 = {2.0, 5.0, 2.0};
        double[] tab3 = {0.5, 5.0, 1.0};

        ArrayList<Athlete> a1 = new ArrayList<>();
        a1.add(new Athlete("Dawid", "", tab));
        a1.add(new Athlete("Aawid", "", tab2));
        a1.add(new Athlete("Cawid", "", tab3));

        a1.sort(new RecordComparator());
        System.out.println(a1);
        a1.sort(new NationalityNameComparator());
        System.out.println(a1);



    }
}
