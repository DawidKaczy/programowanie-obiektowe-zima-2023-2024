package checking2;

import java.util.Objects;

public class GenericAreArraysEqual {
    public static void main(String[] args) {
        Integer[] tab = {1,2,3,4};
        Integer[] tab2 = {1,2,3,4};
        System.out.println(areArraysEqual(tab, tab2));
    }
    public static <T extends Comparable<T>> boolean areArraysEqual(T[] tab, T[] tab2) {
        if (tab.length == tab2.length) {
            for (int i = 0; i < tab.length; i++) {
                return tab[i].equals(tab2[i]);
            }
        }
        return false;
    }
}

