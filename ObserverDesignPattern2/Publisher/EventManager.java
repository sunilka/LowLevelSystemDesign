package ObserverDesignPattern2.Publisher;
import ObserverDesignPattern2.Listeners.Listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class EventManager {
    public HashMap<String, List<Listener>> listeners = new HashMap<String,List<Listener>>();

    public EventManager(String... eventTypes){
        for(String eventType: eventTypes){
            this.listeners.put(eventType,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Listener listener){
        List<Listener> users = this.listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Listener listener){
        List<Listener> users = this.listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType){
        List<Listener> users = this.listeners.get(eventType);
        for(Listener user: users){
            user.update(eventType);
        }
    }
}
