package verification;

public class GenericTsEitherNull {

    public static void main(String[] args) {
        Integer[] tab = {1,2,3};
        Integer[] tab2 = null;
        System.out.println(isEitherNull(tab, tab2));
    }

    public static <T>boolean isEitherNull(T element1, T element2)
    {
        return element1 == null || element2 == null;
    }
}
