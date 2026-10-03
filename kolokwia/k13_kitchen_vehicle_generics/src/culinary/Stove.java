package culinary;

public class Stove implements Cloneable{
    private String burners;
    private String brand;
    private int serialNumber;

    public Stove(String burners, String brand, int serialNumber) {
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }


    public String getBurners() {
        return burners;
    }

    public String getBrand() {
        return brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public Stove clone() {
        try {
            Stove clone = (Stove) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Stove{" +
                "burners='" + burners + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
