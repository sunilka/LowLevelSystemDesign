package ObserverDesignPattern.Listeners;

public class FileSaveListener implements EventListener{
    public void update(String eventType){
        System.out.print("File has been saved by someone");
    }
}
