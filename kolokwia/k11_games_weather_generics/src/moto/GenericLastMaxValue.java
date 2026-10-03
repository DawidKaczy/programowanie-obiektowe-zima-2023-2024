package moto;

public class GenericLastMaxValue {
    public static void main(String[] args) {
        Integer[] tab = {3,4,10,3};
        System.out.println(lastMaxValue(tab));

    }
    static <T extends Comparable<T>>T lastMaxValue(T[] tab){
        if(tab == null || tab.length == 0)
        {
            throw new IllegalArgumentException("Nie może byc pusta ani null");
        }

        T wynik = tab[0];
        for(T elem: tab)
        {
            if(elem.compareTo(wynik) > 0)
            {
                wynik = elem;
            }
        }
        return wynik;
    }
}
