package java8.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Piotrek
 */
public class DiscountEvent implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(int discount) {
        observers.forEach(o -> o.inform(discount));
    }
}
