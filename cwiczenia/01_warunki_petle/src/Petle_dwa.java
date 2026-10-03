import java.util.Scanner;

public class Petle_dwa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 50;
        int wynik = 0;
        int i = 0;
        while (i < a)
        {
            i++;
            wynik = wynik + i;
        }
        System.out.print("Wynik= ");
        System.out.println(wynik);

    }
}
