package games;

import java.util.ArrayList;

public class TestGames {
    public static void main(String[] args) {
        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(3.0);
        a1.add(4.0);
        a1.add(2.0);

        ArrayList<Double> a2 = new ArrayList<>();
        a2.add(3.0);
        a2.add(2.0);
        a2.add(1.0);
        ComputerGame g1= new ComputerGame("WWa", "Konon", a1);
        ComputerGame g2= new ComputerGame("WWa", "Konon", a2);
        System.out.println(g1.toString());
        g1.addRating(1.0);
        System.out.println(g1);
        g1.removeRating(4.0);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g1.equals(g2));
    }
}
