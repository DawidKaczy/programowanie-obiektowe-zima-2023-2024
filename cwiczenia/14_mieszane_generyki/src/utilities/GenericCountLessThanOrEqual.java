package utilities;

public class GenericCountLessThanOrEqual {

    public static void main(String[] args) {
        Integer[] tab = {1,2,3,4,5};
        System.out.println(countLessThanOrEqual(tab,3));

    }
    public static <T extends Comparable<T>>int countLessThanOrEqual(T[] tab, T element)
    {
        int wynik = 0;
        for (T elem: tab)
        {
            if(elem.compareTo(element) <= 0)
            {
                wynik++;
            }
        }
        return wynik;
    }
}
