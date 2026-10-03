package sports;

import java.util.ArrayList;

public class TestAthlete {
    public static void main(String[] args) {

        Double[] tab = {2.0};
        Double[] tab2 = {1.0,2.3,4.0};
        Double[] tab3 = {3.0};
        Double[] tab4 = {1.2};


        ArrayList<Athlete> a1 = new ArrayList<>();
        a1.add(new Athlete("Dawid", "Pl", tab));
        a1.add(new Athlete("Ania", "Pl", tab2));
        a1.add(new Athlete("Celina", "Pl", tab3));
        a1.add(new Athlete("Brajan", "Pl", tab4));



        a1.sort(new RecordComparator());
        System.out.println(a1);

        a1.sort(new NationalityNameComparator());
        System.out.println(a1);




    }
}
