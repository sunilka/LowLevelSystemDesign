package Delivery.Customers;
import java.util.*;

public class CustomerManager {
    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public List<Customer> getAllCustomers(){
        return this.customers;
    }

    public Customer getCustomerByCustomerID(int customerID){
        for(int i=0; i<this.customers.size(); i++){
            if(this.customers.get(i).customerID == customerID){
                return this.customers.get(i);
            }
        }
        System.out.println("Cound not find any customers having the customer ID : " + customerID);
        return null;
    }
}
