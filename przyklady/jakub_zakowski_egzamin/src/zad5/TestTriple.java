package zad5;

import zad3.InfoMessage;

public class TestTriple {
    public  static <T> T findMin(Triple<? extends Canine>obj){
        if (obj.element1.index> obj.element2.index){
            return (T) obj.element1;
        }
        return (T) obj.element2;
    }
    public static void main(String[] args) {
        Triple<Dog> o1 = new Triple<>(new Dog(1), new Dog(2), new Dog(3));

    }
}
