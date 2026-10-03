package music;

import java.util.ArrayList;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> s1 = new ArrayList<>();
        s1.add(new Song("A1", "Dawid", 0));
        s1.add(new Song("D1", "Dawid", 0));
        s1.add(new Song("B1", "Dawid", 0));
        s1.add(new Song("C1", "Dawid", 0));
        s1.add(new Song("BB", "Dawid", 0));

        s1.sort(new DurationTitleComparator());
        System.out.println(s1);

    }
}
