package aviation;

import java.util.ArrayList;

public class TestPilot {
    public static void main(String[] args) {

        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(3.0);
        a1.add(4.0);
        a1.add(1.0);
        a1.add(3.0);


        Pilot p1 = new Pilot("Dawid", a1);
        Pilot p2 = p1.clone();
        p1.zamiana(99.0);
        System.out.println(p1);
        System.out.println(p2);
    }
}
