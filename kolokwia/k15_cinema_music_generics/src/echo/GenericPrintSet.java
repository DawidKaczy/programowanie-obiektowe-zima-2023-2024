package echo;

import java.util.HashSet;

public class GenericPrintSet {
    public static void main(String[] args) {
        HashSet<Student> h1 = new HashSet<>();
        h1.add(new Student(1, "Dawid"));
        h1.add(new Student(2, "Dawid"));
        h1.add(new Student(3, "Dawid"));
        printSet(h1);
    }
    public static<T>void printSet(HashSet<T> hash)
    {
        for(T elem: hash)
        {
            System.out.println(elem);
        }
    }
}
