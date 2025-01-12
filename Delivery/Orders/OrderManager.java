package Delivery.Orders;
import java.util.*;

public class OrderManager {
    private static OrderManager orderManager;
    List<Order> orders = new ArrayList<>();

    private OrderManager(){}

    public static synchronized OrderManager getOrderManagerInstance(){
        if(orderManager == null){
            orderManager = new OrderManager();
        }
        return orderManager;
    }

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
