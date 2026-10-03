package zad9ComparableComparator;

import java.util.ArrayList;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> s1 = new ArrayList<>();
        s1.add(new Song("A", "F", 20));
        s1.add(new Song("C", "G", 70));
        s1.add(new Song("B", "E", 50));
        s1.add(new Song("D", "H", 0));

        s1.sort(new DurationComparator());
        System.out.println(s1);

        s1.sort(new ArtistTitleComparator());
        System.out.println(s1);



    }
}
