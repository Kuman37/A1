/**
 * A concrete builder producing an action-focused representation of the product[cite: 1].
 */
public class ShonenActionBuilder implements AnimeBuilder {
    private String title;
    private String genre;
    private String primaryColorPalette;
    private int episodeDurationMinutes;
    private String studio;

    @Override
    public AnimeBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public AnimeBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public AnimeBuilder setPrimaryColorPalette(String palette) {
        this.primaryColorPalette = palette;
        return this;
    }

    @Override
    public AnimeBuilder setEpisodeDurationMinutes(int minutes) {
        this.episodeDurationMinutes = minutes;
        return this;
    }

    @Override
    public AnimeBuilder setStudio(String studio) {
        this.studio = studio;
        return this;
    }

    @Override
    public AnimeSeries build() {
        return new AnimeSeries(title, genre, primaryColorPalette, episodeDurationMinutes, studio);
    }
}