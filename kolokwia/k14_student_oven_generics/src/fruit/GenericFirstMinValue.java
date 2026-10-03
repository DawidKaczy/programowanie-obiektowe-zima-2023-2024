package fruit;

import java.util.ArrayList;

public class GenericFirstMinValue {

    public static void main(String[] args) {
        Fruit[] a1 = {new Fruit("Dabłko", 50), new Fruit("Babłko", 30), new Fruit("Cabłko", 20)};
        System.out.println(firstMinValue(a1));

        Integer[] tab = {3,1,2};
        System.out.println(firstMinValue(tab));

    }

    public static<T extends Comparable<T>>T firstMinValue(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            throw new IllegalArgumentException("Nie może być pusta");
        }
        T min = tab[0];
        for(T elem: tab)
        {
            if(elem.compareTo(min) < 0)
            {
                min = elem;
            }
        }
        return min;
    }
}
