import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// type sout and press Tab
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int b = scanner.nextInt();
        System.out.print("Dodawanie: ");
        System.out.println(a+b);
        System.out.print("Odejmowanie: ");
        System.out.println(a-b);
        System.out.print("Mnożenie: ");
        System.out.println(a*b);
        System.out.print("Dzielenie: ");
        System.out.println(a/b);


    }
}


