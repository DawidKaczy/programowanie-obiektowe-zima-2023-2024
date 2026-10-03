package algorithm;

public class GenerateCompareThree {

    public static void main(String[] args) {

        Student s1 = new Student("Dawid", 2);
        Student s2 = new Student("Dawid", 2);
        Student s3 = new Student("Dawid", 2);
        System.out.println(compareThree(s1, s2, s3));
    }

    static<T>Boolean compareThree(T element1, T element2, T element3)
    {
        return element1.equals(element2) && element2.equals(element3);
    }
}
