package Delivery.DeliveryPartner;
import java.util.*;
import Delivery.Location.*;
import Delivery.Orders.*;;

public class DeliveryPartner {
    int deliveryPartnerID;
    String deliveryPartnerName;
    String deliveryPartnerPhoneNo;
    Location deliveryPartnerLocation;
    int averageDeliverySpeed;
    List<Order> orders = new ArrayList<>();

    public DeliveryPartner(int deliveryPartnerID, String deliveryPartnerName, String deliveryPartnerPhoneNo,
        Location deliveryPartnerLocation, int averageDeliverySpeed, List<Order> orders) {
        this.deliveryPartnerID = deliveryPartnerID;
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerPhoneNo = deliveryPartnerPhoneNo;
        this.deliveryPartnerLocation = deliveryPartnerLocation;
        this.averageDeliverySpeed = averageDeliverySpeed;
        this.orders = orders;
    }

    public int getDeliveryPartnerID() {
        return this.deliveryPartnerID;
    }

    public String getDeliveryPartnerName() {
        return this.deliveryPartnerName;
    }

    public String getDeliveryPartnerPhoneNo() {
        return this.deliveryPartnerPhoneNo;
    }

    public Location getDeliveryPartnerLocation(){
        return this.deliveryPartnerLocation;
    }

    public int getDeliveryPartnerAvgSpeed(){
        return this.averageDeliverySpeed;
    }

    public List<Order> getDeliveryPartnerOrders(){
        return this.orders;
    }

    public void assignOrder(List<Order> orders){
        this.orders = orders;
    }
}
