package Delivery.Customers;
import Delivery.Location.*;

public class Customer {
    int customerID;
    String customerName;
    String customerPhoneNo;
    Location customerLocation;

    public Customer(int customerID, String customerName, String customerPhoneNo, Location location){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.customerLocation = location;
    }

    public int getCustomerID(){
        return this.customerID;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerPhoneNo(){
        return this.customerPhoneNo;
    }

    public Location getCustomerLocation(){
        return this.customerLocation;
    }
}
