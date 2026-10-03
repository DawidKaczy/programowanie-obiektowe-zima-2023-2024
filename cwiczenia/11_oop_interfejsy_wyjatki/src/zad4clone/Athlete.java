package zad4clone;
public class Athlete implements Cloneable{
    String name;
    int lapTime;


    public Athlete(String name, int lapTime) {
        this.name = name;
        this.lapTime = lapTime;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTime=" + lapTime +
                '}';
    }

    @Override
    public Athlete clone() {
        try {
            Athlete clone = (Athlete) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
