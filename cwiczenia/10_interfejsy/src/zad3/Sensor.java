package zad3;

public interface Sensor {
    abstract double readValue();
    abstract String getStatus();
    abstract void reset();
}
