package ZestawE17finding;

public class GenericFinding {

    public static void main(String[] args) {
        Integer[] tab = {null,null ,null,null,null};
        Integer[] tab2 = {null,2 ,null,null,null};
        String[] tab3 = {null,null ,"oki",null,null};
        System.out.println(findFirstNonNull(tab));
        System.out.println(findFirstNonNull(tab2));
        System.out.println(findFirstNonNull(tab3));

    }


    static<T>T findFirstNonNull(T[] tab)
    {
        for(T elem: tab)
        {
            if(elem != null)
            {
                return elem;
            }
        }
        return null;
    }
}
