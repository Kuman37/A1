public class AnimeSeries {
    private final String title;
    private final String genre;
    private final String primaryColorPalette;
    private final int episodeDurationMinutes;
    private final String studio;

    public AnimeSeries(String title, String genre, String primaryColorPalette, int episodeDurationMinutes, String studio) {
        this.title = title;
        this.genre = genre;
        this.primaryColorPalette = primaryColorPalette;
        this.episodeDurationMinutes = episodeDurationMinutes;
        this.studio = studio;
    }

    @Override
    public String toString() {
        return String.format(
                "Anime Series [Title: '%s', Genre: %s, Palette: %s, Episode Length: %d mins, Studio: %s]",
                title, genre, primaryColorPalette, episodeDurationMinutes, studio
        );
    }
}