package zad4clone;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Dawid", 20);
        Athlete a2 = a1.clone();
        a2.name = "Kasia";
        System.out.println(a1.toString());
        System.out.println(a2);


    }
}
