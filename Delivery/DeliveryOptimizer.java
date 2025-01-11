package Delivery;

import Delivery.Customers.*;
import Delivery.DeliveryPartner.*;
import Delivery.DeliveryStrategies.DeliveryContext;
import Delivery.DeliveryStrategies.GreedyDeliveryStrategy;
import Delivery.Location.Location;
import Delivery.Orders.Order;
import Delivery.Orders.OrderManager;
import Delivery.Restaurants.*;
import java.util.*;

public class DeliveryOptimizer {
    public CustomerManager customerManager;
    public DeliveryPartnerManager deliveryPartnerManager;
    public OrderManager orderManager;
    public RestaurantManager restaurantManager;

    public DeliveryOptimizer(CustomerManager customerManager, DeliveryPartnerManager deliveryPartnerManager, OrderManager orderManager, RestaurantManager restaurantManager){
        this.customerManager = customerManager;
        this.deliveryPartnerManager = deliveryPartnerManager;
        this.orderManager = orderManager;
        this.restaurantManager = restaurantManager;
    }

    public static void main(String args[]){
        DeliveryOptimizer deliveryOptimizer = new DeliveryOptimizer(
            new CustomerManager(),
            new DeliveryPartnerManager(),
            new OrderManager(),
            new RestaurantManager()
        );

        // Creating Restaurants
        deliveryOptimizer.restaurantManager.addRestaurant(new Restaurant(1, "Restaurant 1", new Location(12.930, 77.620)));
        deliveryOptimizer.restaurantManager.addRestaurant(new Restaurant(2, "Restaurant 2", new Location(12.940, 77.635)));
        
        // Creating Customers
        deliveryOptimizer.customerManager.addCustomer(new Customer(111, "Customer 1", "222233331", new Location(12.935, 77.624)));
        deliveryOptimizer.customerManager.addCustomer(new Customer(222, "Customer 2", "444412222", new Location(12.938, 77.630)));
        
        // Creating Delivery partner.
        DeliveryPartner deliveryPartner = new DeliveryPartner(
            123, 
            "Delivery Partner 1",
            "123456789", 
            new Location(12.935, 77.624), 
            20, null
        );
        deliveryOptimizer.deliveryPartnerManager.addDeliveryPartner(deliveryPartner);

        // Creating Orders.
        Order order1 = new Order(991, 1, 111, 10, deliveryPartner);
        Order order2 = new Order(992, 2, 222, 15, deliveryPartner);
        deliveryOptimizer.orderManager.registerOrder(order1);
        deliveryOptimizer.orderManager.registerOrder(order2);

        // Assiging both the orders to the delivery partner
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        deliveryPartner.assignOrder(orders);

        // Creating the delivery context and assiging greedy delivery startegy.
        DeliveryContext deliveryContext = new DeliveryContext();
        deliveryContext.assignDeliveryStrategy(new GreedyDeliveryStrategy(deliveryOptimizer.orderManager, deliveryOptimizer.customerManager, deliveryOptimizer.restaurantManager, deliveryOptimizer.deliveryPartnerManager));
        List<Integer> ans = deliveryContext.runRouteCalculator(deliveryPartner);
        System.out.println(ans);
    }
}
