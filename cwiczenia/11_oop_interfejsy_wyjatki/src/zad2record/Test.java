package zad2record;

public class Test {
    public static void main(String[] args) {
        Address a1 = new Address("Rynkowa", 20, "11-700", "Mrągowo");
        Person p1 = new Person("Dawid", "Kaczy", a1);
        System.out.println(a1);
        System.out.println(p1);
    }
}
