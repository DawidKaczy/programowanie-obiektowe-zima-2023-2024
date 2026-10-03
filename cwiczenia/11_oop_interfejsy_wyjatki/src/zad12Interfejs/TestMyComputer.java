package zad12Interfejs;

public class TestMyComputer implements MyComparator{
    public static void main(String[] args) {
        MyComparator c1 = new TestMyComputer();
        System.out.println(c1.compare(4,3));
    }
}
