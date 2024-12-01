public class SpecialEdition extends MangaDecorator {
    public SpecialEdition(Manga manga) {
        super(manga);
    }

    public String decorate() {
        return super.decorate() + decorateWithSpecialEdition();
    }

    private String decorateWithSpecialEdition() {
        return " [Special Edition]";
    }
}
