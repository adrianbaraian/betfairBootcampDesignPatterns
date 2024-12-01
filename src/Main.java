public class Main {
    public static void main(String[] args) {
        // Get the singleton Publisher instance
        Publisher publisher = Publisher.getInstance();

        // Create basic manga
        Manga naruto = new MangaImpl("Naruto");
        Manga sailorMoon = new MangaImpl("Sailor Moon");

        // Add decorators
        Manga specialNaruto = new SpecialEdition(naruto);
        Manga bonusNaruto = new BonusChapter(specialNaruto, 101);
        Manga specialSailorMoon = new SpecialEdition(sailorMoon);

        // Publish manga
        publisher.publishManga(naruto);
        publisher.publishManga(bonusNaruto);
        publisher.publishManga(specialSailorMoon);

        // Get published mangas
        for (Manga manga : publisher.getPublishedMangas()) {
            System.out.println("Published - " + manga.decorate());
        }

    }
}
