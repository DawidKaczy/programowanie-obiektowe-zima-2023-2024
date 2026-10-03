// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        StringBuilder ok1 = new StringBuilder("Romakniu");

        System.out.println(odwrot("Rower"));
        polindrom("oko");
        System.out.println(usuwacz("Ala ma koty"));

        trimToSize(ok1, 2);
        System.out.println(ok1);

    }
    public static String odwrot(String arg)
    {
        StringBuilder sb = new StringBuilder(arg);
        sb.reverse();
        return sb.toString();
    }
    public static void polindrom(String arg) {
        StringBuilder sb = new StringBuilder(arg);
        StringBuilder sb2 = sb.reverse();
        if(arg.contentEquals(sb2))
        {
            System.out.println("Polindrom");
        }
        else {
            System.out.println("Nie Polindrom");
        }
    }

    public static String usuwacz(String arg) {
        StringBuilder sb = new StringBuilder(arg);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'A') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void trimToSize(StringBuilder sb, int n)
    {
        if (n< 0)
            return;
        if (sb.length() > n) {
            sb.setLength(n);
        }
    }


}