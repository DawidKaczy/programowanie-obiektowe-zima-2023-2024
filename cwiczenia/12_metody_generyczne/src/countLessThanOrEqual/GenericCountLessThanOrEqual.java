package countLessThanOrEqual;

import maxValue.Person;

public class GenericCountLessThanOrEqual {

    public static void main(String[] args) {
        Person p1 = new Person("Dawid", 2);
        Person p2 = new Person("Dawid", 2);
        Integer[] tab = {1,2,3};
        System.out.println(countLessThanOrEqual(tab, 2));


    }
    public static<T extends Comparable<T>> int countLessThanOrEqual(T[] tab, T element)
    {
        int wynik = 0;
        T temp = tab[0];
        for(T elem: tab)
        {
            if(elem.compareTo(element) <= 0)
            {
                wynik++;
            }
        }
        return wynik;
    }
}
