package aviation;

public class TestPilot {
    public static void main(String[] args) {

        double[] tab = {20.0, 30.0, 40.0, 50.0 , 60.0};
        Pilot p1 = new Pilot("Dawid", tab);
        Pilot p2 = p1.clone();
        p1.zamianaMiejsc(999.0);
        p2.zamianaMiejsc(3);
        System.out.println(p1);
        System.out.println(p2);

    }


}
