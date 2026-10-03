package echo;

import java.util.HashSet;

public class GenericPrintSet {
    public static void main(String[] args) {
        HashSet<Student> s1 = new HashSet<>();
        s1. add(new Student("Dawid", 3));
        s1. add(new Student("Dawid", 3));
        s1. add(new Student("Dawid", 3));
        s1. add(new Student("Dawid", 3));

        printSet(s1);
    }
    public static<T>void printSet(HashSet<T> list)
    {
        for(T elem: list)
        {
            System.out.println(elem);
        }
    }
}
