package Delivery.Restaurants;
import java.util.*;

public class RestaurantManager {
    private static RestaurantManager restaurantManager;
    List<Restaurant> restaurants = new ArrayList<>();

    private RestaurantManager(){}

    public static RestaurantManager getRestaurantManagerInstance(){
        if(restaurantManager == null){
            restaurantManager = new RestaurantManager();
        }
        return restaurantManager;
    }

    public void addRestaurant(Restaurant restaurant){
        this.restaurants.add(restaurant);
    }

    public List<Restaurant> getAllRestaurants(){
        return this.restaurants;
    }

    public Restaurant getRestaurantByRestaurantID(int restaurantID){
        for(int i=0; i<this.restaurants.size(); i++){
            if(this.restaurants.get(i).getRestaurantID() == restaurantID){
                return this.restaurants.get(i);
            }
        }
        System.out.println("Cound not find any restaurant for the specified restaurant ID : " + restaurantID);
        return null;
    }
}
