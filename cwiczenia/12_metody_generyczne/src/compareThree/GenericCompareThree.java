package compareThree;

public class GenericCompareThree {

    public static void main(String[] args) {
        Student s1 = new Student("Dawid", 3);
        Student s2 = new Student("Dawid", 3);
        Student s3 = new Student("Dawid", 2);
        System.out.println(s1.equals(s2));

        System.out.println(compareThree(s1, s2 ,s3));

    }

    public static<T>boolean compareThree(T elem1, T elem2, T elem3)
    {
        return elem1.equals(elem2) && elem2.equals(elem3);
    }
}
