package verification;

public class GenericDisplayIfDistinct {
    public static void main(String[] args) {
        displayIfDistinct(1,2,3);
    }
    public static<T>void displayIfDistinct(T element1, T element2, T element3)
    {
        if(!element1.equals(element2) && !element1.equals(element3) && !element2.equals(element3))
        {
            System.out.println("Wszystkie trzy są różne");
        }
    }
}
