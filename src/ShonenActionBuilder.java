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
        validateAnimeConfiguration();
        return new AnimeSeries(title, genre, primaryColorPalette, episodeDurationMinutes, studio);
    }

    private void validateAnimeConfiguration() {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalStateException("Build failed: Anime title cannot be null or empty.");
        }
        if (primaryColorPalette == null || primaryColorPalette.trim().isEmpty()) {
            throw new IllegalStateException("Build failed: Primary color palette must be defined.");
        }
        if (episodeDurationMinutes <= 0 || episodeDurationMinutes > 60) {
            throw new IllegalStateException("Build failed: Episode duration must be realistic (1-60 mins) to easily fit into an evening schedule for viewers arriving home at 18:00.");
        }
    }}