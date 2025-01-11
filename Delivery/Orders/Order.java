package Delivery.Orders;
import Delivery.DeliveryPartner.DeliveryPartner;

public class Order {
    int orderID;
    int orderRestaurantID;
    int orderCustomerID;
    int orderPrepTime;
    DeliveryPartner deliveryPartner;

    public Order(int orderID, int orderResturantID, int orderCustomerID, int orderPrepTime, DeliveryPartner deliveryPartner){
        this.orderID = orderID;
        this.orderRestaurantID = orderResturantID;
        this.orderCustomerID = orderCustomerID;
        this.orderPrepTime = orderPrepTime;
        this.deliveryPartner = deliveryPartner;
    }

    public int getOrderID(){
        return this.orderID;
    }

    public int getOrderCustomerID(){
        return this.orderCustomerID;
    }

    public int getOrderRestaurantID(){
        return this.orderRestaurantID;
    }

    public void assignOrderPrepTime(int orderPrepTime){
        this.orderPrepTime = orderPrepTime;
    }

    public int getOrderPrepTime(){
        return this.orderPrepTime;
    }

    public void assignDeliveryPartnerForOrder(DeliveryPartner deliveryPartner){
        this.deliveryPartner = deliveryPartner;
    }

    public DeliveryPartner getDeliveryPartnerInfoForOrder(){
        return this.deliveryPartner;
    }
}
