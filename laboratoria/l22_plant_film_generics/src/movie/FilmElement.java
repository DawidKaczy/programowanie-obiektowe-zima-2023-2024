package movie;

public interface FilmElement {
    abstract void setupScene(String sceneType);
    abstract String evaluatePerformance(int performanceRating);

    default void cut() {
        System.out.println("Koniec sceny");
    }

    default void adjustLighting() {
        System.out.println("Dostasowauje oświetlenie");
    }

    static String info() {
        return "Informacje o FilmElement";
    }
}
