import java.util.Arrays;
import java.util.Scanner;

public class Tablice3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);


        int[] tab = {5,88,3,4,5,6,9,4,5,6};
        int wynik = tab[0];
        for(int i = 0; i < tab.length ;i++)
        {
            if(tab[i] > wynik)
                wynik = tab[i];
        }
        System.out.println("Największa: ");
        System.out.println(wynik);

        for(int i = 0; i < tab.length ;i++)
        {
            if(tab[i] < wynik)
                wynik = tab[i];
        }

        System.out.println("Najmniejsza: ");
        System.out.println(wynik);
    }
}
//        int[] tab = new int[10];
//        for(int i = 0; i < 10 ;i++)
//        {
//            tab[i] = scanner.nextInt();
//        }