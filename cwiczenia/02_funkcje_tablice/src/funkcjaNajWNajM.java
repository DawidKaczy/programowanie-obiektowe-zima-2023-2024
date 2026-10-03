import java.util.Scanner;

public class funkcjaNajWNajM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab ={0,0,0,0,0,0,0,0,0,0};
        System.out.println("Podaj 10 liczb całkowitych");
        for(int i =0; i < 10; i++)
        {
            tab[i] = scanner.nextInt();
        }

        int wynik = NajW(tab);
        System.out.print("Największa = ");
        System.out.println(wynik);

        int wynik2 = NajM(tab);
        System.out.print("Najmniejsza = ");
        System.out.println(wynik2);
    }

    public static int NajW(int[] tab)
    {
        int wynik = tab[0];
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > wynik)
            {
                wynik = tab[i];
            }
        }
        return wynik;
    }

    public static int NajM(int[] tab)
    {
        int wynik = tab[0];
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] < wynik)
            {
                wynik = tab[i];
            }
        }
        return wynik;
    }
}
