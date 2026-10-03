package art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery a1 = ArtGallery.getInstance("Dawid");
        ArtGallery a2 = ArtGallery.getInstance("Dawid2");
        System.out.println(a1);
        System.out.println(a2);
    }
}
