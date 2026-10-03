package movie;

public class FilmElementTest {
    public static void main(String[] args) {
        Actor a1 = new Actor();
        a1.setupScene("akcja");
        a1.setupScene("dramat");
        a1.setupScene("fikcja");
        System.out.println(a1.evaluatePerformance(5));
        System.out.println(a1.evaluatePerformance(6));
        a1.cut();
        a1.adjustLighting();
        System.out.println(FilmElement.info());
    }
}
