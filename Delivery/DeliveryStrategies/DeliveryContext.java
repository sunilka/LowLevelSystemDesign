package Delivery.DeliveryStrategies;
import java.util.List;

import Delivery.DeliveryPartner.DeliveryPartner;

public class DeliveryContext {
    DeliveryStrategy deliveryStrategy;

    public void assignDeliveryStrategy(DeliveryStrategy deliveryStrategy){
        this.deliveryStrategy = deliveryStrategy;
    }

    public List<Integer> runRouteCalculator(DeliveryPartner deliveryPartner){
        return this.deliveryStrategy.calculateOptimalRoute(deliveryPartner);
    }
}
