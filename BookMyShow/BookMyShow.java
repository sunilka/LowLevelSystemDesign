package BookMyShow;

public class BookMyShow {

    MovieController movieController;
    TheaterController theaterController;

    BookMyShow(MovieController movieController, TheaterController theaterController) {
        this.movieController = movieController;
        this.theaterController = theaterController;
    }

    void createBooking(){
        // Create a booking
    }
}
