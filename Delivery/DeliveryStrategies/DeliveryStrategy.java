package Delivery.DeliveryStrategies;
import Delivery.DeliveryPartner.DeliveryPartner;
import java.util.*;

public interface DeliveryStrategy {
    public List<Integer> calculateOptimalRoute(DeliveryPartner deliveryPartner);
}
