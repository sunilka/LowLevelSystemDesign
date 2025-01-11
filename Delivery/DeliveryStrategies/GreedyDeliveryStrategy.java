package Delivery.DeliveryStrategies;
import Delivery.Customers.Customer;
import Delivery.Customers.CustomerManager;
import Delivery.DeliveryPartner.DeliveryPartner;
import Delivery.DeliveryPartner.DeliveryPartnerManager;
import Delivery.Orders.*;
import Delivery.Restaurants.*;
import Delivery.Location.*;
import java.util.*;

public class GreedyDeliveryStrategy implements DeliveryStrategy{
    OrderManager orderManager;
    CustomerManager customerManager;
    RestaurantManager restaurantManager;
    DeliveryPartnerManager deliveryPartnerManager;

    public GreedyDeliveryStrategy(OrderManager orderManager, CustomerManager customerManager, RestaurantManager restaurantManager, DeliveryPartnerManager deliveryPartnerManager){
        this.orderManager = orderManager;
        this.customerManager = customerManager;
        this.restaurantManager = restaurantManager;
        this.deliveryPartnerManager = deliveryPartnerManager;
    }

    public static double _haversine(double lat1, double lon1, double lat2, double lon2) {
        double R = 6371.0; 
        lat1 = Math.toRadians(lat1); 
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2) +
                   Math.cos(lat1) * Math.cos(lat2) * Math.sin(dlon / 2) * Math.sin(dlon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

    public static double travelTime(double distance) {
        double SPEED = 20;
        return (distance / SPEED) * 60.0;
    }

    public List<Integer> calculateOptimalRoute(DeliveryPartner deliveryPartner){
        List<Order> orders = deliveryPartner.getDeliveryPartnerOrders();
        int numberOfOrders = orders.size();
        List<Integer> sequence = new ArrayList<>();
        boolean[] visited = new boolean[numberOfOrders];
        
        int currentOrder = 0; 
        sequence.add(currentOrder);
        visited[currentOrder] = true;

        for(int i=1; i<numberOfOrders; i++){
            int closetOrder = -1;
            double minDistance = Double.MAX_VALUE;

            for(int j=0; j<numberOfOrders; j++){
                if(!visited[j]){
                    Order current = orders.get(sequence.get(i-1));
                    Customer customerInfo = this.customerManager.getCustomerByCustomerID(current.getOrderCustomerID());
                    Location customerLocation = customerInfo.getCustomerLocation();
                    Restaurant restaurantInfo = this.restaurantManager.getRestaurantByRestaurantID(current.getOrderRestaurantID());
                    Location restaurantLocationInfo = restaurantInfo.getRestaurantLocation();
                    double dist = _haversine(
                        customerLocation.getLatitude(), customerLocation.getLongitude(),
                        restaurantLocationInfo.getLatitude(), restaurantLocationInfo.getLongitude()
                        
                    );
                    if(dist < minDistance){
                        minDistance = dist;
                        closetOrder = j;
                    }
                }
            }

            sequence.add(closetOrder);
            visited[closetOrder] = true;
        }
        return sequence;
    }
}
