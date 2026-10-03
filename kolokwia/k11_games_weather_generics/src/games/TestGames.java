package games;

public class TestGames {
    public static void main(String[] args) {
        double[]tab= {2.0, 3.0, 5.0};
        ComputerGame c1 = new ComputerGame("Wot", "Ktos", tab);
        ComputerGame c2 = new ComputerGame("Wot", "Ktos", tab);
        System.out.println(c1.toString());
        c1.add(7.0);
        System.out.println(c1);
        c1.remove(3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
    }
}
