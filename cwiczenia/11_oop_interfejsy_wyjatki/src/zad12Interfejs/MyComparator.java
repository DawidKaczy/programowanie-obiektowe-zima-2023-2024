package zad12Interfejs;

public interface MyComparator {
    default int compare(int a, int b)
    {
        return Integer.compare(a, b);
    }
}
