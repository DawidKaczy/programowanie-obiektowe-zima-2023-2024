package ZestawE18;

public class GenericContainsDuplicates {

    public static void main(String[] args) {
        System.out.println(containsDuplicates(2,2,3));
        System.out.println(containsDuplicates("Dawid","Dawid2","Dawid3"));
    }
    static<T>boolean containsDuplicates(T element1, T element2 , T element3)
    {
        return (element1.equals(element2) || element2.equals(element3) || element1.equals(element3));
    }
}
