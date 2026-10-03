package echo;

public class GenericEchoIfEquivalent {
    public static void main(String[] args) {
        Student s1 = new Student("Dawid", 20);
        Student s2 = new Student("Dawid2", 20);
        Student s3 = new Student("Dawid3123", 20);
        echoIfEquivalent(s1,s2,s3);
    }
    public static <T>void echoIfEquivalent(T element1, T element2, T element3)
    {
        if(element1.equals(element2) && element2.equals(element3))
        {
            System.out.println( "Wszystkie trzy są równoważne");
        }
        else
        {
            System.out.println("Nie są");
        }

    }
}
