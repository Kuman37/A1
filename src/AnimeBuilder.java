public interface AnimeBuilder {
    AnimeBuilder setTitle(String title);
    AnimeBuilder setGenre(String genre);
    AnimeBuilder setPrimaryColorPalette(String palette);
    AnimeBuilder setEpisodeDurationMinutes(int minutes);
    AnimeBuilder setStudio(String studio);

    AnimeSeries build();
}