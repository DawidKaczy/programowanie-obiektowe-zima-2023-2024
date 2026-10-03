package zad5_generics_guitar;

public class TestGuitar {
    public static void main(String[] args) {
        ElectricGuitar g1 = new ElectricGuitar();
        Guitar g2 = new Guitar();
        System.out.println(compareObjects(g1, g2));
    }
    public static<T extends Guitar>  boolean compareObjects(T o1, T o2){
        return o1.getClass() == o2.getClass();
    }
}
