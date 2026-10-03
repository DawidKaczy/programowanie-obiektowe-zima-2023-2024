package moto;

public interface Vehicle {
    abstract void startEngine(String fuelType);
    public boolean canDrive (int fuelLevel);

    default void stop()
    {
        System.out.println("Pojazd zatrzymany");
    }

    default void honk()
    {
        System.out.println("Bi bip");
    }

    static String info()
    {
        return "Interfejs Vehicle (Pojazd) - informacje ogólne.";
    }
}
