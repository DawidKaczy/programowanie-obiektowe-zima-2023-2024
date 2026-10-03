package vehicle;

public class GenericIsDescending {
    public static void main(String[] args) {
        Integer[]tab={1,2,3,4};
        System.out.println(isDescending(tab));
    }

    public static <T extends Comparable<T>>boolean isDescending(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            throw new NullPointerException("nie może być pusta");
        }

        for(int i = 1; i < tab.length; i++)
        {
            if(tab[i-1].compareTo(tab[i]) > 0)
            {
                return true;
            }
        }
        return false;
    }
}
