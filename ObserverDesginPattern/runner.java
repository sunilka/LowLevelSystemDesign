package ObserverDesginPattern;

import ObserverDesginPattern.Listeners.FileOpenListener;
import ObserverDesginPattern.Listeners.FileSaveListener;

public class runner {
    public static void main(String args[]){
        Editor editor = new Editor();
        editor.events.subscribe("Open", new FileOpenListener());
        editor.events.subscribe("Save", new FileSaveListener());

        editor.openFile();
        editor.saveFile();
    }
}
