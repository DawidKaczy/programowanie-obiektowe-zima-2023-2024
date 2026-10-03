public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "x5", 240.0);
        Vehicle v2 = new Vehicle("BMW", "x5", 240.0);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v1.equals(v2));
        v1.drive();

        Car c1 = new Car("BMW", "x5", 240.0,4);
        Car c2 = new Car("BMW", "x5", 240.0,4);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        c1.drive();
    }
}
