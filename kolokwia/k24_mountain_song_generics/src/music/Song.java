package music;

public record Song(String title, String artist, int duration) implements Comparable<Song> {
    @Override
    public int compareTo(Song o) {
        if(Integer.compare(duration, o.duration) == 0)
        {
            return o.title.compareTo(title);
        }
        return Integer.compare(duration, o.duration);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}' + "\n";
    }
}
