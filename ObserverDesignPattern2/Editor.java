package ObserverDesignPattern2;

import ObserverDesginPattern.Publisher.EventManager;

public class Editor {
    EventManager events;
    
    public Editor(){
        this.events = new EventManager("Open", "Save");
    }

    void fileOpen(){
        events.notify("Open");
    }

    void fileSave(){
        events.notify("Save");
    }
}