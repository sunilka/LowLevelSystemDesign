package ObserverDesignPattern.Listeners;

public class FileOpenListener implements EventListener{
    public void update(String eventType){
        System.out.println("The file was opened by someone");
    }
}
