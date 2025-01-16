package ObserverDesignPatternRevision.Listener;

public class FileOpen implements ListenerInterface{
    public void update(){
        System.out.println("Someone has opened the file");
    }
}
