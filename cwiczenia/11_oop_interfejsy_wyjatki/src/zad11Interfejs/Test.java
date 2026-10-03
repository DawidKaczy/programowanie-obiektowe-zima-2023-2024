package zad11Interfejs;

public class Test {
    public static void main(String[] args) {
        LoudAnimal c = new Cat();
        LoudAnimal d = new Dog();
        c.makeNoise();
        d.makeNoise();
    }
}
