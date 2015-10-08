package java8.patterns.observer;

/**
 * @author Piotrek
 */
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(int discount);
}
