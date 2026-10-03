package zad4;

public class TestDataProcessor {
    public static void main(String[] args) {
        DataProcessor d1 = new TextProcessor();
        System.out.println(d1.processData("Dawid"));
        System.out.println(d1.isValid(""));
    }
}
