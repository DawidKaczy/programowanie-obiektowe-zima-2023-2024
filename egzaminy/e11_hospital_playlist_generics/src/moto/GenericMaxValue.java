package moto;

public class GenericMaxValue {
    public static void main(String[] args) {
        Integer[] tab = {0,2,67,3,1,3};
        System.out.println(maxValue(tab));
    }

    public static <T extends Comparable<T>>T maxValue(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            return null;
        }

        T temp = tab[0];
        for(T elem: tab)
        {
            if(temp.compareTo(elem) < 0)
            {
                temp = elem;
            }
        }
        return temp;
    }
}
