package music;

import java.util.ArrayList;

public class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Kotek");
        l1.add("Celina");
        MusicStore ms = new MusicStore("Dawid", "Jan", l1);
        ms.addAlbum("NowoHotel");
        System.out.println(ms);
        ms.removeAlbum("NowoHotel");
        System.out.println(ms);
    }
}
