package geography;

public class TestMountain {
    public static void main(String[] args) {
        double[] tab = {2.0,3.0,1.0};
        Mountain m1 = new Mountain("Ewerest", tab);
        Mountain m2 = m1.clone();
        m1.zamiana(5.0);
        System.out.println(m1);
        System.out.println(m2);

    }
}
