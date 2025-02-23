package BookMyShow;


// We can use strategy design pattern to perform the payment here.
public class Payment {
    int payementID;
    
    public boolean performPayment() {
        // Perform the payment
        System.out.println("Payment done successfully");
        return true;
    }
}
