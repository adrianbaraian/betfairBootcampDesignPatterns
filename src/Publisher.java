import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private static Publisher instance;
    private final List<Manga> publishedMangas = new ArrayList<>();

    private Publisher() {
    }

    public static Publisher getInstance() {
        if (instance == null) {
            instance = new Publisher();
        }
        return instance;
    }

    public void publishManga(Manga manga) {
        publishedMangas.add(manga);
    }

    public List<Manga> getPublishedMangas() {
        return publishedMangas;
    }
}
