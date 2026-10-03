package zad17Błąd;

import java.util.Scanner;

public class FormatDanychChecker {
    static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException
    {
        if(dane.length() < 4)
        {
            throw new NiepoprawnyFormatDanychException("Mniejszy niz 4");
        }
        System.out.println(dane);

    }

    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            String a1 = scanner.next();
            sprawdzFormatDanych(a1);
        }
        catch (NiepoprawnyFormatDanychException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
