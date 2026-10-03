package zad18bład;

import java.util.Scanner;

public class sprawdzFormatDanych {
    static void sprawdzFormatDanych(double wynik) throws NiepoprawnyFormatDanychException
    {
        if(wynik < 20.0)
        {
            throw new NiepoprawnyFormatDanychException("Liczba mniejsza od 20");
        }
        System.out.println("Wynik większy niż 20.0: " + wynik);
    }

    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            for(int i =0; i <10; i++)
            {
                double a1 = scanner.nextDouble();
                sprawdzFormatDanych(a1);
            }
        }
        catch (NiepoprawnyFormatDanychException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
