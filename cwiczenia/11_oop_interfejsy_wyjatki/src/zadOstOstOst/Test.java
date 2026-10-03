package zadOstOstOst;

public class Test {
    public static<T>T findMin(Triple<? extends Bird> birdss)
    {
        if(birdss.element1.a > birdss.element2.a)
            return (T) birdss.element1;
        return  (T) birdss.element2;
    }
}
