package aviation;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class TestPilot {
    public static void main(String[] args) {
        ArrayList<Double> ok1 = new ArrayList<>();
        ok1.add(10.5);
        ok1.add(10.5);
        ok1.add(10.5);
        ok1.add(10.5);

        Pilot originalPilot = new Pilot("John Doe", ok1);
        Pilot o2 = originalPilot.clone();
        originalPilot.zamiana(3);
        System.out.println(originalPilot);
        System.out.println(o2);


    }
}
