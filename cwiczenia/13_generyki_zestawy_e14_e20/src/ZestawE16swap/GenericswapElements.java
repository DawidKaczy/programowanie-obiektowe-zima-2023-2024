package ZestawE16swap;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericswapElements {
    public static void main(String[] args) {
        Integer[] tab = {0,1,2,3,4};
        swapElements(tab, 1,4);
        System.out.println(Arrays.toString(tab));



        VideoGame[] games = {
                new VideoGame("Title1", "Developer1", 4.5f),
                new VideoGame("Title2", "Developer2", 3.8f),
                new VideoGame("Title3", "Developer3", 4.2f)
        };

        System.out.println(Arrays.toString(games));
        swapElements(games, 1,2);
        System.out.println(Arrays.toString(games));

    }

    static<T>void swapElements(T[] tab, int a, int b)
    {
        T temp = tab[b];
        tab[b] = tab[a];
        tab[a] = temp;
    }
}
