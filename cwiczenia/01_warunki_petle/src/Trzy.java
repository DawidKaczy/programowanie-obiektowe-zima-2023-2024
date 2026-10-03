import java.util.Scanner;

public class Trzy {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //1
        System.out.println("Podaj 1 liczbę");
        double a = scanner.nextDouble();
        System.out.println("Podaj 2 liczbę");
        double b = scanner.nextDouble();
        System.out.println("Podaj 3 liczbę");
        double c = scanner.nextDouble();
        System.out.println("Podaj 3 liczbę");
        double d = scanner.nextDouble();
        System.out.println(a+b+c+d);

        //2
        System.out.println("Podaj 4 liczby");
        double wynik = 0;
        for(int i =0; i < 4; i++)
        {
            double e = scanner.nextDouble();
            wynik = wynik + e;
        }
        System.out.println(wynik);
    }
}
