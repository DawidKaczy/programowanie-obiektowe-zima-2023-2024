package pl.programowanieGeneryczne;

public class GenericCheckSequence {
    public static void main(String[] args) {
        System.out.println(checkSequence(1,2,3));
        System.out.println(checkSequence(3,2,1));
        System.out.println(checkSequence(1,2,1));

    }
    public static <T extends Comparable<T>>boolean checkSequence(T elem1, T elem2, T elem3)
    {
        return elem1.compareTo(elem2) > 0 && elem2.compareTo(elem3) > 0 || elem1.compareTo(elem2) < 0 && elem2.compareTo(elem3) < 0;
    }
}
