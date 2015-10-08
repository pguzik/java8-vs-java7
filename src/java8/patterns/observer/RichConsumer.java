package java8.patterns.observer;

/**
 * @author Piotrek
 */
public class RichConsumer implements Observer {
    @Override
    public void inform(int discount) {
        if (discount > 0 && discount < 50){
            System.out.println("I buy only if I know that poor cannot afford it! " + discount);
        }
    }
}
