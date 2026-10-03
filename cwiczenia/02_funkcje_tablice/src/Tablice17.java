public class Tablice17 {
    public static void main(String[] args) {
        int[] tab = {0, 0, 0, 2, 2, 3, 0, 0, 7, 0, 0, 1};

        System.out.println("Ilość zer: ");
        System.out.println(zera(tab));
    }

    public static int zera(int[] tab) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                wynik++;
            }
        }
        return wynik;
    }
}