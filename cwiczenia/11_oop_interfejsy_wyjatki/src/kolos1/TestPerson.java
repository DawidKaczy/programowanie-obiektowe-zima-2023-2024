package kolos1;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Dawid", 18);
        System.out.println(p1);
        System.out.println(p1.czyPełnolietni());
    }
}
