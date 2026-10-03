package zad2;

public class Car implements Comparable<Car>{
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        if(Integer.compare(o.mileage, mileage) == 0){
            return Integer.compare(o.yearOfProduction, yearOfProduction);
        }
        return Integer.compare(o.mileage, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", yearOfProduction=" + yearOfProduction +
                '}' + "\n";
    }
}
