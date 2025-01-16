package ObserverDesignPatternRevision.Publisher;

import java.util.*;

import ObserverDesignPatternRevision.Listener.ListenerInterface;

public class PublisherManager {
    HashMap<String, List<ListenerInterface>> listeners= new HashMap<>();

    public PublisherManager(List<String> eventTypes){
        for(int i=0;i<eventTypes.size(); i++){
            listeners.put(eventTypes.get(i), new ArrayList<>());
        }
    }

    public void subscribe(String eventType, ListenerInterface listener){
        this.listeners.get(eventType).add(listener);
    }

    public void notify(String eventType){
        List<ListenerInterface> listners_list = this.listeners.get(eventType);
        for(int i=0;i<listners_list.size(); i++){
            listners_list.get(i).update();
        }
    }
}
