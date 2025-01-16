package ObserverDesignPatternRevision.Listener;

public class FileSave implements ListenerInterface{
    public void update(){
        System.out.println("Someone has saved the file");
    }
}
