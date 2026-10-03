import java.util.Scanner;

public class Instrukcje_warunkowe_piec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        if(wiek < 0)
        {
            System.out.println("Nie można mieć na miniusie lat");
        }
        else if(wiek < 18)
        {
            System.out.println("Jesteś niepełnoletni");
        }
        else if(wiek < 65)
        {
            System.out.println("Jesteś dorosły");
        }
        else {
            System.out.println("Jesteś emeryt");
        }
    }
}
