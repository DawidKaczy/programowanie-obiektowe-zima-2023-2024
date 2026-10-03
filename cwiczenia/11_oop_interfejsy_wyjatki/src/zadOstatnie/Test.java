package zadOstatnie;

public class Test {
    public static<T> T  findMinMaxHeight(Tree[] trees, Pair<? super Tree> result)
    {
        if(result.element1.equals(result.element2))
            return (T) result.element1;
        return null;
    }

    public static void main(String[] args) {
        Pair<Tree> t1 = new Pair<>(new Tree(3), new Tree(3), new Tree(2));
    }
}
