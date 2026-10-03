import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe n");
        int n = scanner.nextInt();
        int wynik = szereg(n);
        System.out.print("N-ta liczba ciągu wynosi= " );
        System.out.println(wynik);
    }
    public static int szereg(int n)
    {
        int suma = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 ==0)
            {
                suma = suma - i;
            }
            else
            {
                suma = suma + i;
            }
        }
        return suma;
    }
}