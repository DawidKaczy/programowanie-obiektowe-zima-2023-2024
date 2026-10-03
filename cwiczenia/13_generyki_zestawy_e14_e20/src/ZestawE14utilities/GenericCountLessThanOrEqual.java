package ZestawE14utilities;

public class GenericCountLessThanOrEqual {

    public static void main(String[] args) {
        Integer[] tab = {0,0,1,2,3,4,5,6,7,8,9};
        System.out.println(countLessThanOrEqual(tab,4));
    }



    static <T extends Comparable<T>>int  countLessThanOrEqual(T[] tab, T element)
    {
        int wynik = 0;
        T mniejsze = element;
        for(T elem: tab)
        {
            if(elem.compareTo(mniejsze) < 0)
            {
                wynik++;
            }
        }
        return wynik;
    }
}
