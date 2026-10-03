import java.util.Objects;

public class Oven implements Appliance {
    @Override
    public void turnOn(String powerSource) {
        if(Objects.equals(powerSource, "elektryczność") || Objects.equals(powerSource, "gaz"))
        {
            System.out.println("Pikarnik włączony zasilaniem "+ powerSource);
        }
        else {
            System.out.println("Nieznane źródło zasilania");
        }
    }

    @Override
    public boolean isReady(int temperature) {
        return temperature > 180;
    }
}
