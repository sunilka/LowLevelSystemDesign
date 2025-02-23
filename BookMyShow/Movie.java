package BookMyShow;

public class Movie {
    String movieName;
    int movieId;
    int duration;
    String language;
    String genre;

    public Movie(String movieName, int movieId, int duration, String language, String genre) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.duration = duration;
        this.language = language;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getDuration() {
        return duration;
    }

    public String getLanguage() {
        return language;
    }

    public String getGenre() {
        return genre;
    }

}
