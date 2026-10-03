import java.util.Arrays;
import java.util.Scanner;

public class Tablice10 {
    public static void main(String[] args) {
        int[] tab = {2,2,2,2,2,2,3};
        int wynik = 0;
        int wynik2 = 0;

        for(int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                wynik++;
            }
            else
            {
                wynik2++;
            }
        }
        System.out.println("Parzyste: ");
        System.out.println(wynik);
        System.out.println("Nie parzyste: ");
        System.out.println(wynik2);
    }
}
