import java.util.Scanner;

public class Funkcje_metody_jedenjeden {
    public static void main(String[] args) {

        int n = 1121;
        int wynik = sprawdzCzySameJedynki(n);
        if (wynik == 1)
        {
            System.out.println(n + " składa się z samych jedynek.");
        }
        else
        {
            System.out.println(n + " nie składa się z samych jedynek.");
        }
    }

    public static int sprawdzCzySameJedynki(int n) {

        String liczbaJakoTekst = Integer.toString(n);
        for (char cyfra : liczbaJakoTekst.toCharArray())
        {
            if (cyfra != '1')
            {
                return 0; // jeśli jakakolwiek cyfra nie jest 1, zwracamy 0
            }
        }
        return 1; // jeśli doszliśmy tutaj, oznacza to, że wszystkie cyfry były 1
    }


}

