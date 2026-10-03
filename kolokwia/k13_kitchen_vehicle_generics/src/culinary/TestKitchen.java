package culinary;

public class TestKitchen {
    public static void main(String[] args) {
        Stove s1 = new Stove("ok1", "Beko", 123);
        Kitchen k1 = new Kitchen("kuchnia 1", s1);
        System.out.println(k1);
        Kitchen k2 = k1.clone();
        k1.setName("ok2");
        System.out.println(k1);
        System.out.println(k2);
    }
}
