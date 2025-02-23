package BookMyShow;

import java.util.List;

public class TheaterController {
    List<Theater> theaters;

    public TheaterController(List<Theater> theaters) {
        this.theaters = theaters;
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
    }
}
