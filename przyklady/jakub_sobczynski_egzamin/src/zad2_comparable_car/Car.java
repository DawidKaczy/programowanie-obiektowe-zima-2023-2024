package zad2_comparable_car;

public class Car implements Comparable<Car>{
    String brand;
    int mileage;
    int yearOfProduction;
    public Car(String brand, int mileage, int yearOfProduction){
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public int compareTo(Car o) {
        if(Integer.compare(this.mileage, o.mileage) == 0){
            return Integer.compare(this.yearOfProduction, o.yearOfProduction);
        }
        else return Integer.compare(this.mileage, o.mileage);
    }
}
