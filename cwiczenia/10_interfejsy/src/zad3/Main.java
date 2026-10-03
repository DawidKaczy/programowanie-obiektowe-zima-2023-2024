package zad3;

public class Main {
    public static void main(String[] args) {
        Sensor s1 = new TemperatureSensor(2);

        System.out.println(s1.readValue());
        System.out.println(s1.getStatus());
        s1.reset();
    }
}
