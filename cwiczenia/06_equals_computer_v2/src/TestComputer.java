import java.util.ArrayList;

public class TestComputer {
    public static void main(String[] args) {
        ArrayList<Integer> ok = new ArrayList<>();
        ok.add(1);
        ok.add(2);
        ok.add(0);
        ArrayList<Integer> okk = new ArrayList<>();
        okk.add(3);
        okk.add(-99);
        okk.add(9);

        Computer c1 = new Computer("ok", ok, okk);

        System.out.println(c1.toString());
        System.out.println(c1.copyListy());


    }
}
