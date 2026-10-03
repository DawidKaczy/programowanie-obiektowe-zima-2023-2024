package moto;

public class GenerateMaxValue {

    public static void main(String[] args) {
        Integer[] tab = {4,5,9,8,6,1};
        String[] tab2 = {"B", "C", "D", "A"};

        System.out.println(maxValue(tab));
        System.out.println(maxValue(tab2));
    }

    static <T extends Comparable<T>>T maxValue(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            throw new IllegalArgumentException("Nie może być pusta ani nullem");
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
