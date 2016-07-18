package observer_pattern;

import java.util.concurrent.CopyOnWriteArrayList;

public class Subject {
    private CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    public void notifyObservers(HentaEvent event) {
        for(Observer observer : observers){
            observer.notify(event);
        }
    }
}
