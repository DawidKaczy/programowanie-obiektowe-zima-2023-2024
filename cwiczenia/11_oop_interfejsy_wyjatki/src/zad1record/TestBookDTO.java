package zad1record;

public class TestBookDTO {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Kubuś puchatek", "Dawid", 18.00, 1999);
        BookDTO b2 = new BookDTO("", "Dawid", 20.00, 2000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.czyWiekszy());
        System.out.println(b2.czyWiekszy());
    }
}
