package zad3;

public class TemperatureSensor implements Sensor{
    double temperatura;

    public TemperatureSensor(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double readValue() {
        return temperatura;
    }

    @Override
    public String getStatus() {
        return "Temperatura wynosi:" + temperatura;
    }

    @Override
    public void reset() {
        System.out.println("Reset temperatury");
        temperatura = 0;
    }
}
