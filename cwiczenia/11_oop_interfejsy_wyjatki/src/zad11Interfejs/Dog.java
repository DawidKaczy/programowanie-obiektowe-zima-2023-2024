package zad11Interfejs;

public class Dog implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Hał");
    }
}
