package zad3record;

public record MusicTrack(String title, String name, int time) {


    public MusicTrack(String title, String name) {
        this(title, name, 180);
    }


}
