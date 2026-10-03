package music;

import java.util.ArrayList;

public class Testsong {

    public static void main(String[] args) {
        ArrayList<Song> a1 = new ArrayList<>();
        a1.add(new Song("Jestem", "", 20));
        a1.add(new Song("Amberk", "", 20));
        a1.add(new Song("Celka", "", 10));
        a1.add(new Song("Berk", "", 5));

        a1.sort(new DurationComparator());
        System.out.println(a1);

        a1.sort(new ArtistTitleComparator());
        System.out.println(a1);
    }
}
