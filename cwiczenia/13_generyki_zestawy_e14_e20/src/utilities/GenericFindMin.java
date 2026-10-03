package utilities;

public class GenericFindMin {

    public static void main(String[] args) {
        System.out.println(findMin(1,3,2));
    }

    public static <T extends Comparable<T>>T findMin(T element1, T element2, T element3)
    {
        T temp = element1;
        if(element2.compareTo(temp) < 0)
        {
            temp = element2;
        }
        if(element3.compareTo(temp) < 0)
        {
            temp = element3;
        }
        return temp;
    }
}
