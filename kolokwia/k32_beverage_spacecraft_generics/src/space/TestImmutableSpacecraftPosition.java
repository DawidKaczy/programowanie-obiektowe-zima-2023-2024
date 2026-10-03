package space;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition m1 = new ImmutableSpacecraftPosition(1.0,2.0,3.0);
        System.out.println(m1);
        System.out.println(m1.move(4,-5,6));

    }
}
