package zad9ComparableComparator;

import java.util.Comparator;
import java.util.Objects;

public class Song {
    String title;
    String artist;
    int duration;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}'+ "\n";
    }
}

class DurationComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.duration, o2.duration);
    }
}


class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        if(o1.getArtist().compareTo(o2.getArtist())== 0)
        {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return o1.getArtist().compareTo(o2.getArtist());
    }
}