import java.util.Scanner;

public class Instrukcje_warunkowe_trzy {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Podaj dzień tygodnia od 1 do 7");
        int a = scanner.nextInt();
        if(a>7 || a ==0 || a < 0)
        {
            System.out.println("Błąd!");
            System.out.println("Podaj liczbę z przedziału od 1 do 7");
        }
        else if(a == 1 )
        {
            System.out.println("Twój dzień to Poniedziałek");
        }
        else if(a == 2 )
        {
            System.out.println("Twój dzień to Wt");
        }
        else if(a == 3 )
        {
            System.out.println("Twój dzień to Śr");
        }
        else if(a == 4 )
        {
            System.out.println("Twój dzień to Czw");
        }
        else if(a == 5 )
        {
            System.out.println("Twój dzień to Pt");
        }
        else if(a == 6 )
        {
            System.out.println("Twój dzień to Sb");
        }
        else
        {
            System.out.println("Twój dzień to Niedziala");
        }
        }
}
