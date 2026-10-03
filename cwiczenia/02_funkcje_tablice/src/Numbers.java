import java.util.Random;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Liczba losowa:");
        System.out.println(generateRandomInt());
        System.out.println("Napisz swój przedział (włącznie z granicami):");
        System.out.println("Dolna granica");
        int dol = scanner.nextInt();
        System.out.println("Górna granica");
        int gora = scanner.nextInt();
        System.out.print("Liczba losowa: ");
        System.out.println(generateRandomInt(dol, gora));


    }

    public static int generateRandomInt()
    {
        Random random = new Random();
        return random.nextInt();
    }

    public static int generateRandomInt(int dol, int gora)
    {
        Random random = new Random();
        return random.nextInt(dol, gora+1);
    }






}




