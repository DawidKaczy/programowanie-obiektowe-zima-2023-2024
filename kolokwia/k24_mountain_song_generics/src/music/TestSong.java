package music;

import java.util.ArrayList;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> s1 = new ArrayList<>();
        s1.add(new Song("Maju maj", "Ktos", 20));
        s1.add(new Song("Aaju maj", "Ktos", 20));
        s1.add(new Song("Daju maj", "Ktos", 20));
        s1.add(new Song("Baju maj", "Ktos", 20));
        s1.add(new Song("Caju maj", "Ktos", 20));

        Collections.sort(s1);
        System.out.println(s1);
    }
}
