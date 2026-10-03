import com.sun.jdi.FloatType;

import java.util.Scanner;

public class Cztery {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok kwadrat");
        float a = scanner.nextFloat();
        System.out.print("Pole kwadrat= ");
        System.out.println(a * a);

    }
}
