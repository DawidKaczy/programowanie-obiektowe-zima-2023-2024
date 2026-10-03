public class ApplianceTest {
    public static void main(String[] args) {
        Oven o1 = new Oven();
        o1.turnOn("elektryczność");
        o1.turnOn("gaz");
        o1.turnOn("woda");
        System.out.println(o1.isReady(180));
        System.out.println(o1.isReady(181));
        o1.emitSound();
        System.out.println(Appliance.info());
        o1.turnOff();

    }
}
