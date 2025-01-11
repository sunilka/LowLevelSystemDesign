package Delivery.Orders;
import java.util.*;

public class OrderManager {
    List<Order> orders = new ArrayList<>();

    public void registerOrder(Order order){
        this.orders.add(order);
    }

    public List<Order> getAllOrders(){
        return this.orders;
    }

    public Order getOrderByOrderID(int orderID){
        for(int i=0; i<this.orders.size(); i++){
            if(this.orders.get(i).orderID == orderID){
                return this.orders.get(i);
            }
        }
        System.out.println("Cound not find the order for the OrderID : " + orderID);
        return null;
    }
}
