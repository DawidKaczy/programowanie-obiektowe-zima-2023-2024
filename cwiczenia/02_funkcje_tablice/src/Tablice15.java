import java.util.Arrays;
import java.util.Scanner;

public class Tablice15 {
    public static void main(String[] args) {
        double[] tab = {1.2,2,3,4};

        System.out.println(srednia(tab));
    }

    public static double srednia(double[] tab)
    {
        double temp = 0;
        double wynik = 0;
        for(int i = 0; i < tab.length; i++)
        {
            wynik = tab[i] + wynik;
        }
        return  wynik / tab.length;
    }

}