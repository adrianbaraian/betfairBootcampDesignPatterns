public abstract class MangaDecorator implements Manga {
    private final Manga manga;

    public MangaDecorator(Manga manga) {
        this.manga = manga;
    }

    @Override
    public String decorate() {
        return manga.decorate();
    }
}
