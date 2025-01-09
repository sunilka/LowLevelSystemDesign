package ObserverDesignPattern2.Listeners;

public class FileOpenListener implements Listener{
    public void update(String eventType){
        // Here, the event has occured and you do the handling of the event here.
        System.out.println("Someone has opened the file");
    }
}
