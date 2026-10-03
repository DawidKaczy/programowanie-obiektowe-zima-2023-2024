import java.util.ArrayList;

public class TestComputer {
    public static void main(String[] args) {
        ArrayList<Double>lista = new ArrayList<>();
        lista.add(1.0);
        lista.add(5.0);
        Computer c1 = new Computer("Dawid", "Kaczynski", lista);
        Computer c2 = new Computer("Dawid", "Kaczynski", lista);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.sumLists());
        Laptop l1 = new Laptop("Dawid", "Kaczynski", lista , 12.0);
        Laptop l2 = new Laptop("Dawid", "Kaczynski", lista , 12.0);
        System.out.println(l1.toString());
        System.out.println(l1.equals(l2));
        System.out.println(l1.sumLists());
    }
}
