package ZestawE19comparisons;

public class GenericIsFirstLargest {

    public static void main(String[] args) {
        System.out.println(isFirstLargest(3,4,5));
        System.out.println(isFirstLargest(6,2,1));
    }
    static<T extends  Comparable<T>>boolean isFirstLargest(T element1, T element2, T element3)
    {
        return element1.compareTo(element2) > 0 && element1.compareTo(element3) > 0;
    }
}
