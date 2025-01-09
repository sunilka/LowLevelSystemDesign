package ObserverDesginPattern.Publisher;
import java.util.Map;

import ObserverDesginPattern.Listeners.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    public Map<String, List<EventListener>> listeners = new HashMap<String, List<EventListener>>();

    public EventManager(String... operations){
        for(String operation: operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    public void subscribe(String eventType, EventListener eventListener){
        List<EventListener> users = listeners.get(eventType);
        users.add(eventListener);
    }
    public void unsubscribe(String eventType, EventListener eventListener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(eventListener);
    }
    public void notify(String eventType){
        List<EventListener> users = listeners.get(eventType);
        for(EventListener listener:users){
            listener.update(eventType);
        }
    }
}

