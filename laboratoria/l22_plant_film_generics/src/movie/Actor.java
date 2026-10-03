package movie;

import java.util.Objects;

public class Actor implements FilmElement{
    @Override
    public void setupScene(String sceneType) {
        if(Objects.equals(sceneType, "akcja") || Objects.equals(sceneType, "dramat"))
        {
            System.out.println("Scena " + sceneType + " została przygotowana");
        }
        else {
            System.out.println("Nieznany typ sceny");
        }
    }

    @Override
    public String evaluatePerformance(int performanceRating) {
        if(performanceRating > 5)
        {
            return "Doskonały występ";
        }
        else {
            return "Potrzebna jest poprawa";
        }
    }
}
