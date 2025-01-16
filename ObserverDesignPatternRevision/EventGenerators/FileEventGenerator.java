package ObserverDesignPatternRevision.EventGenerators;

import java.util.*;

import ObserverDesignPatternRevision.Publisher.PublisherManager;

public class FileEventGenerator {
    public PublisherManager publisherManager;

    public FileEventGenerator(){
        List<String> events = new ArrayList<>();
        events.add("Open");
        events.add("Save");
        this.publisherManager = new PublisherManager(events);
    }

    public void FileOpen(){
        this.publisherManager.notify("Open");
    }
    
    public void FileSave(){
        this.publisherManager.notify("Save");
    }
}
