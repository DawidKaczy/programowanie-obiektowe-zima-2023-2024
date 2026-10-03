package academy;

public class TestStudent {
    public static void main(String[] args) {
        int[] tab = {2,3,4,4,2};
        Student s1 = new Student("Dawid", tab);
        String s2 = String.valueOf(s1.clone());
        s1.zamiana(10);
        System.out.println(s1);
        System.out.println(s2);


    }
}
