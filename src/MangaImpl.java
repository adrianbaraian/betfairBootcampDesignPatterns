public class MangaImpl implements Manga {
    private final String title;

    public MangaImpl(String title) {
        this.title = title;
    }

    @Override
    public String decorate() {
        return "Manga: " + this.title;
    }
}
