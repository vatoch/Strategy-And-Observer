package org.example;

public class Main {
    public static void main(String[] args) {
        NotifyAlgorithm algorithm = new MobileNotifyAlgorithm();

      Observable store = new AppleStore(algorithm);

      Observer observer1 = new Customer();
      Observer observer2 = new Customer();
      Observer observer3 = new Customer();
      store.addObserver(observer1);
      store.addObserver(observer2);
      store.addObserver(observer3);
      store.notifyObservers();

    }
}