package BookMyShow;

public class Show {
    int showID;
    Screen screen;
    String showTime;
    Movie movie;

    public Show(int showID, Screen screen, String showTime, Movie movie) {
        this.showID = showID;
        this.screen = screen;
        this.showTime = showTime;
        this.movie = movie;
    }

    public int getShowID() {
        return showID;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getShowTime() {
        return showTime;
    }

    public Movie getMovie() {
        return movie;
    }
    
}
