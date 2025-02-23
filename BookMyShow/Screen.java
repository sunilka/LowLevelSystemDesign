package BookMyShow;

import java.util.List;

public class Screen {
    List<Seat> seats;
    int screenId;
    int totalSeats;

    public Screen(int screenId, int totalSeats, List<Seat> seats) {
        this.screenId = screenId;
        this.totalSeats = totalSeats;
 
        for(int i = 0; i < totalSeats; i++) {
            this.seats.add(seats.get(i));
        }
    }

    public int getScreenId() {
        return screenId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}   

