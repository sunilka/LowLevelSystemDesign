package ObserverDesignPatternRevision;

import ObserverDesignPatternRevision.EventGenerators.FileEventGenerator;
import ObserverDesignPatternRevision.Listener.FileOpen;
import ObserverDesignPatternRevision.Listener.FileSave;

public class Runner {
    public static void main(String args[]){
        FileEventGenerator fileEventGenerator = new FileEventGenerator();
        fileEventGenerator.publisherManager.subscribe("Open", new FileOpen());
        fileEventGenerator.publisherManager.subscribe("Save", new FileSave());
        fileEventGenerator.FileOpen();
        fileEventGenerator.FileSave();
    }
}
