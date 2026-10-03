package kolos4;

import java.util.Scanner;

public class sprawdzFormatDanych {
    static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException
    {
        if(dane.length() <= 4)
            throw new NiepoprawnyFormatDanychException("Za krótki");
        System.out.println("Dane ok " + dane);
    }


    public static void main(String[] args) {

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


