package zad16Błąd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try
        {
            System.out.println("Podaj a");
            int a = scanner.nextInt();
            System.out.println("podaj b");
            int b = scanner.nextInt();


            if(b == 0)
            {
                throw new ArithmeticException("Nie dzielimy przez 0");
            }
            System.out.println("Wynik dzielenia " + a/b);
        }


        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Błąd: Wprowadzono nieprawidłowe dane. Wprowadź liczby całkowite.");
        }
    }




}
