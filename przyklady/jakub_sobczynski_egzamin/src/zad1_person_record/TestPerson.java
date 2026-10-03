package zad1_person_record;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", -1);
        System.out.println(p1);
        System.out.println(p1.isAdult());
    }
}
