package zad10Clonable;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Dawid", "Matematyka", 5);
        Teacher t2 = t1.clone();
        t1.name = "Dziwka";
        System.out.println(t1);
        System.out.println(t2);

    }
}
