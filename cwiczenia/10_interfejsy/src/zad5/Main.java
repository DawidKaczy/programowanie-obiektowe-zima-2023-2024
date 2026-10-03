package zad5;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new StandardowyPrinter();
        Biuro p2 = new Biuro(p1);

        p2.drukujDokument("okok");


    }
}
