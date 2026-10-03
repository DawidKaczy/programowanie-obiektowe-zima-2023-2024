package zadOstatnieOstat;

public class Testy {
    public static <T extends Animal> boolean findMax(T o1, T o2)
    {
        return o1.equals(o2);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(2,2);
        Dog d2 = new Dog(2,2);

        Animal a1 = new Animal(2);
        System.out.println(findMax(d1,a1));
    }
}
