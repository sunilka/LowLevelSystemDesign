package BookMyShow;

import java.util.List;

public class Booking {
    Show show;
    List<Seat> seats;
    Payment payment;

    public Booking(Show show, List<Seat> seats, Payment payment) {
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public void makePayment() {
        payment.performPayment();
    } 
}
