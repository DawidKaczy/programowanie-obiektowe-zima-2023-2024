package aviationmanagement;

public class TestFlight {
    public static void main(String[] args) {
        Aircraft a1 = new Aircraft("OK1", "Lot", 2000, 100);
        Aircraft a2 = new Aircraft("OK1", "Lot", 2000, 100);
        Flight f1 = new Flight("2", "Maj", a1, 100);
        Flight f2 = new Flight("2", "Maj", a2, 100);
        System.out.println(a1);
        System.out.println(f1);
        System.out.println(a1.equals(a2));
        System.out.println(f1.equals(f2));
    }



}
