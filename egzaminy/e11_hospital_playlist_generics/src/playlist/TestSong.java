package playlist;

import java.util.ArrayList;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> s1 = new ArrayList<>();
        s1.add(new Song("Antarktyda", "Ewelina", 30));
        s1.add(new Song("Cena", "Antek", 20));
        s1.add(new Song("Baranek", "Celina", 30));
        s1.add(new Song("Elefant", "Bartek", 60));
        s1.add(new Song("Dikens", "Daniel", 5));

        s1.sort(new DurationComparator());
        System.out.println(s1);

        s1.sort(new ArtistTitleComparator());
        System.out.println(s1);


    }
}
