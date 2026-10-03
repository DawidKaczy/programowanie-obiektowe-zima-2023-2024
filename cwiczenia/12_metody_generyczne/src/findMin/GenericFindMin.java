package findMin;

public class GenericFindMin {
    public static<T extends Comparable<T>>T findMin(T obj1, T obj2, T obj3)
    {
        T min = obj1;

        if (obj2.compareTo(min) < 0) {
            min = obj2;
        }

        if (obj3.compareTo(min) < 0) {
            min = obj3;
        }

        return min;
    }

    public static void main(String[] args) {
        Integer minInt = findMin(5, 3, 8);
    }
}
