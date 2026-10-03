import java.util.Objects;

public class Vehicle {

    public String brand;
    public String model;
    public Double topSpeed;
    Vehicle(){}
    Vehicle(String brand, String model, Double topSpeed) {
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(topSpeed, vehicle.topSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, topSpeed);
    }

    public void drive(){

        System.out.println("ten pojazd się porusza");
    }
}
class Car extends Vehicle{
    public int numbersOfDoors;

    public Car(String brand, String model, Double topSpeed, int numbersOfDoors) {
        super(brand, model, topSpeed);
        this.numbersOfDoors = numbersOfDoors;
    }
    @Override
    public String toString() {
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", topSpeed=" + topSpeed + '\'' +
                ", numbersOfDoors=" + numbersOfDoors +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numbersOfDoors == car.numbersOfDoors;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbersOfDoors);
    }
    @Override
    public void drive(){
        super.drive();
        System.out.println("ten pojazd jest samochodem");
    }
}
