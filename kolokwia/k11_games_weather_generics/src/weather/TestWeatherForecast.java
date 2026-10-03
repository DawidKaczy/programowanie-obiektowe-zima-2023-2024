package weather;

import java.util.ArrayList;

public class TestWeatherForecast {
    public static void main(String[] args) {
        ArrayList<WeatherForecast> a1 = new ArrayList<>();
        a1.add(new WeatherForecast(1, "Pon", 30.0));
        a1.add(new WeatherForecast(1, "Aon", 5.0));
        a1.add(new WeatherForecast(1, "Con", 10.0));
        a1.add(new WeatherForecast(1, "Bon", 5.0));
        a1.add(new WeatherForecast(1, "Don", 25.0));

        a1.sort(new TemperatureComparator());
        System.out.println(a1);
        a1.sort(new DateComparator());
        System.out.println(a1);

    }
}
