public class Main {
    public static void main(String[] args) {
        AnimeDirector director = new AnimeDirector();

        AnimeBuilder actionBuilder = new ShonenActionBuilder();
        director.constructCommunityDrivenAction(actionBuilder);
        AnimeSeries actionAnime = actionBuilder.build();
        System.out.println("Action Build: " + actionAnime);

        AnimeBuilder fantasyBuilder = new DarkFantasyBuilder();
        director.constructGrimdarkFantasy(fantasyBuilder);
        AnimeSeries fantasyAnime = fantasyBuilder.build();
        System.out.println("Dark Fantasy Build: " + fantasyAnime);

        AnimeSeries customAnime = new ShonenActionBuilder()
                .setTitle("Ultra Neon Skies")
                .setGenre("Cyberpunk Action")
                .setPrimaryColorPalette("Deep Pink, Purple and Bright Blue")
                .setEpisodeDurationMinutes(17)
                .setStudio("Independent Creators")
                .build();

        System.out.println("Custom Manual Build: " + customAnime);
    }
}