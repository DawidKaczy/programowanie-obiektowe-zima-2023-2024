package zestawE20arrayAlg;

public class GenericFindMaxIndex {

    public static void main(String[] args) {
        Integer[] tab = {0,2,4,6,3,1};
        System.out.println(findMaxIndex(tab));
    }
    static<T extends Comparable<T>>int findMaxIndex(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            throw new IllegalArgumentException("Nie może byc pusta i nullem");
        }

        int maxIndex = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].compareTo(tab[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
}
}
