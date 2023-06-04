package org.example;

public class Customer implements Observer{

    @Override
    public void update(String algorithm) {
        System.out.println("Coustomer has been notified by " + algorithm);
    }
}
