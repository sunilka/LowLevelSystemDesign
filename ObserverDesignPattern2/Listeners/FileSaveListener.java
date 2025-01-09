package ObserverDesignPattern2.Listeners;

public class FileSaveListener implements Listener{
    public void update(String eventType){
        System.out.println("Someone has saved the file");
    }
}
