package patterns.observer;

/**
 * @author Piotrek
 */
public class VIPConsumer implements Observer{
    @Override
    public void inform(int discount) {
        if (discount == 0){
            System.out.println("I buy only for original price! " + discount);
        }
    }
}
