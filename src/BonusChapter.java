public class BonusChapter extends MangaDecorator {
    private final int chapterNumber;

    public BonusChapter(Manga manga, int chapterNumber) {
        super(manga);
        this.chapterNumber = chapterNumber;
    }

    public String decorate() {
        return super.decorate() + decorateWithBonusChapter();
    }

    private String decorateWithBonusChapter() {
        return " with Bonus Chapter #" + this.chapterNumber;
    }
}
