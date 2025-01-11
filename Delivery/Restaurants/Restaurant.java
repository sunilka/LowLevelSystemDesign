package Delivery.Restaurants;
import Delivery.Location.*;
import Delivery.Orders.*;
import java.util.*;

public class Restaurant {
    int restaurantID;
    String restaurantName;
    Location resturantLocation;
    List<Order> orders;

    public Restaurant(int restaurantID, String restaurantName, Location resturantLocation){
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.resturantLocation = resturantLocation;
    }

    public int getRestaurantID(){
        return this.restaurantID;
    }

    public String getRestaurantName(){
        return this.restaurantName;
    }

    public Location getRestaurantLocation(){
        return this.resturantLocation;
    }

    public List<Order> getAllOrders(){
        return this.orders;
    }

    public void assignOrderPrepTime(int orderID, int prepTime){
        for(int i=0;i<this.orders.size();i++){
            Order order = this.orders.get(i);
            if(order.getOrderID() == orderID){
                order.assignOrderPrepTime(prepTime);
                break;
            }
        }
    }
}
