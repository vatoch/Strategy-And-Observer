package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppleStore implements  Observable{

    private NotifyAlgorithm notifyAlgorithm;
    private List<Observer> observers;

    public AppleStore(NotifyAlgorithm algorithm ) {
        this.notifyAlgorithm = algorithm;
        observers = new ArrayList<>();

    }

    @Override
    public void notifyObservers() {
        observers.forEach(x-> x.update(notifyAlgorithm.notifyObserver()));

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
