package fruit;

public class GenericIsSorted {
    public static void main(String[] args) {
        Integer[] tab = {1,2,3,5};
        Integer[] tab2 = {3,1,3};
        Integer[] tab3 = {3,1,0};
        System.out.println(isSorted(tab));
        System.out.println(isSorted(tab2));
        System.out.println(isSorted(tab3));
    }

    public static <T extends Comparable<T>>boolean isSorted(T[] tab)
    {

        for(int i = 1; i < tab.length ; i++)
        {
            if(tab[i - 1].compareTo(tab[i]) > 0)
            {
                return false;
            }
        }
        return true;
    }
}
