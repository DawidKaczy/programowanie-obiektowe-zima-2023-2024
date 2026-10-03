import java.util.Scanner;

public class Dwa {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Podaj 1 tekst: ");
        String line = scanner.nextLine();
        System.out.print("Podaj 2 tekst: ");
        String line2 = scanner.nextLine();
        System.out.println(line);
        System.out.println(line2);
    }
}
