package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable {
    String name;
    ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }


    @Override
    public Pilot clone() {
        try {
            Pilot clone = (Pilot) super.clone();
            clone.flightHours = (ArrayList<Double>) this.flightHours.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void zamiana(double number)
    {
        flightHours.set(2, number);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }
}
