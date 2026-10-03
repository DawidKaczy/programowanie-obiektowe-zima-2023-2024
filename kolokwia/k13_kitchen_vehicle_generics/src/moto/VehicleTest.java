package moto;

public class VehicleTest {
    public static void main(String[] args) {
        Car c1 = new Car("diesel", 6);
        Car c2 = new Car("benzyna", 6);
        c1.startEngine(c1.getFuelType());
        c2.startEngine(c2.getFuelType());
        System.out.println(c1.canDrive(c1.getFuelLevel()));
        System.out.println(Vehicle.info());
        c1.stop();
        c1.honk();
    }
}
