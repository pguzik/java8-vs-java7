package java8.patterns.observer;

/**
 * @author Piotrek
 */
public class PoorConsumer implements Observer {
    @Override
    public void inform(int discount) {
        if (discount >= 50){
            System.out.println("I buy only cheap things because I cannot afford anything else! " + discount);
        }
    }
}
