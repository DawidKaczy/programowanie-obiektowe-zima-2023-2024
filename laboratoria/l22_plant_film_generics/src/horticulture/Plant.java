package horticulture;

public class Plant implements Cloneable{
    private double height;
    private String species;
    private int plantID;

    public Plant(double height, String species, int plantID) {
        this.height = height;
        this.species = species;
        this.plantID = plantID;
    }

    public double getHeight() {
        return height;
    }

    public String getSpecies() {
        return species;
    }

    public int getPlantID() {
        return plantID;
    }

    @Override
    public Plant clone() {
        try {
            Plant clone = (Plant) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", species='" + species + '\'' +
                ", plantID=" + plantID +
                '}';
    }
}
