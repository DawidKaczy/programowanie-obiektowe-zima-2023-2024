package zad1;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Dawid", 15);
        Athlete a2 = a1.clone();
        a2.name = "Darek";
        System.out.println(a1);
        System.out.println(a2);
    }


}
