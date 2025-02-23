package BookMyShow;

public class Seat {
    int seatID;
    SeatStatus seatStatus;
    SeatType seatType;

    public Seat(int seatID, SeatStatus seatStatus, SeatType seatType) {
        this.seatID = seatID;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
    }

    public int getSeatID() {
        return seatID;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}

