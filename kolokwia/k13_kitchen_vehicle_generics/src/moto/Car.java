package moto;

import java.util.Objects;

public class Car implements Vehicle{

    private String fuelType;
    private int fuelLevel;

    public Car(String fuelType, int fuelLevel) {
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void startEngine(String fuelType) {
        if(Objects.equals(fuelType, "benzyna") || Objects.equals(fuelType, "diesel"))
        {
            System.out.println("Silnik uruchomiony z użyciem " + fuelType);
        }
        else {
            System.out.println("Nieznany typ paliwa");
        }
    }

    @Override
    public boolean canDrive(int fuelLevel) {
        return fuelLevel > 5;
    }
}

