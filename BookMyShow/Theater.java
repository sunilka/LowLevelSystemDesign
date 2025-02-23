package BookMyShow;

import java.util.List;

public class Theater {
    int theaterId;
    String theaterName;
    String theaterLocation;
    List<Screen> screens;

    public Theater(int theaterId, String theaterName, String theaterLocation, List<Screen> screens) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
        this.screens = screens;
    }

    public String getTheaterLocation() {
        return this.theaterLocation;
    }

    public List<Screen> getScreens(){
        return this.screens;
    } 
}
