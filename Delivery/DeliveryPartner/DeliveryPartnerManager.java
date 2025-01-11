package Delivery.DeliveryPartner;
import java.util.*;

public class DeliveryPartnerManager {
    List<DeliveryPartner> deliveryPartners = new ArrayList<>();

    public void addDeliveryPartner(DeliveryPartner deliveryPartner){
        this.deliveryPartners.add(deliveryPartner);
    }

    public List<DeliveryPartner> getAllDeliveryPartners(){
        return this.deliveryPartners;
    }

    public DeliveryPartner getDeliveryPartnerByDeliveryPartnerID(int deliveryPartnerID){
        for(int i=0; i<this.deliveryPartners.size(); i++){
            if(this.deliveryPartners.get(i).deliveryPartnerID == deliveryPartnerID){
                return this.deliveryPartners.get(i);
            }
        }
        System.out.println("Could not find any delivery partner with the delivery partner ID : " + deliveryPartnerID);
        return null;
    }
}
