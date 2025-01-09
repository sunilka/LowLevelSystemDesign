package ObserverDesignPattern2.Listeners;

public interface Listener {
    // We can pass in the context of the event as well so that the listeners can do something with the context, 
    // basically handle the event as needed using the event context. We have skipped the context here.
    public void update(String eventType);
}
