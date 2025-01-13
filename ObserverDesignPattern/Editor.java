package ObserverDesignPattern;

import ObserverDesignPattern.Publisher.EventManager;

public class Editor {
    public EventManager events;

    public Editor(){
        this.events = new EventManager("Open", "Save");
    }

    public void openFile(){
        events.notify("Open");
    }

    public void saveFile(){
        events.notify("Save");
    }

}
