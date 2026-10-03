package horticulture;

public class TestGarden {
    public static void main(String[] args) {
        Plant p1 = new Plant(20.0, "Roslinka", 1);
        Plant p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }

}
