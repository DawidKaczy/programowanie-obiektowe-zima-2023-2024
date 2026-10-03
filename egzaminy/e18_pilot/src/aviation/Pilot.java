package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable{
    String name;
    double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }
    public void zamianaMiejsc(double zam)
    {
        flightHours[2] = zam;
    }


    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }

    @Override
    public Pilot clone() {
        try {
            Pilot clone = (Pilot) super.clone();
            clone.flightHours = this.flightHours.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
