package ZestawE15checking;

public class GenericIsEqualOrNull {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "world";
        String str3 = null;

        System.out.println(isEqualOrNull(str1,str1));
    }


    static<T>boolean isEqualOrNull(T element1, T element2)
    {
        if ((element1 == null && element2 == null)) return true;
        assert element1 != null;
        return element1.equals(element2);
    }
}
