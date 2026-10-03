import java.util.Scanner;

public class Petle_siedem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        int wynik = obliczSumeCyfr(liczba);
        System.out.println(wynik);

    }
    public static int obliczSumeCyfr(int liczba) {
        int suma = 0;

        liczba = Math.abs(liczba);

        while (liczba > 0) {
            suma += liczba % 10;
            liczba /= 10;
        }
        return suma;
    }
}
