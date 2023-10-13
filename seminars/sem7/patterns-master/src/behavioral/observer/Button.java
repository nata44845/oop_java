package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private int id;
    private List<Observer> observers;

    public Button(int id) {
        this.id = id;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    public void onClick(/*Event event*/){
        //do something
        notifyObservers(/*event*/);
    }

    public int getId() {
        return id;
    }
}
