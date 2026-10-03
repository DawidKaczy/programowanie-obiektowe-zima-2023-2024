import java.util.Arrays;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int[] tablica = new int[10];
        for(int i = 0; i < 10 ;i++)
        {
            tablica[i] = scanner.nextInt();
        }

        int dlugosc = tablica.length;
        for (int i = 0; i < dlugosc / 2; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[dlugosc - 1 - i];
            tablica[dlugosc - 1 - i] = temp;
        }

        System.out.println("Tablica po odwróceniu: ");
        System.out.println((Arrays.toString(tablica)));
    }
}
