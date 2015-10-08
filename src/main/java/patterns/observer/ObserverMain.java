package patterns.observer;

public class ObserverMain {

    public static void main(String[] args) {
        DiscountEvent discountEvent = new DiscountEvent();
        discountEvent.registerObserver(new VIPConsumer());
        discountEvent.registerObserver(new RichConsumer());
        discountEvent.registerObserver(new PoorConsumer());
        discountEvent.notifyObservers(30);

        DiscountEvent discountEventLambda = new DiscountEvent();

        discountEventLambda.registerObserver((int discount) -> {
            if(discount < 50 && discount >= 0){
                System.out.println("I buy only if I know that poor cannot afford it! " + discount); }
        });
        discountEventLambda.registerObserver((int discount) -> {
            if(discount >= 50){
                System.out.println("I buy only cheap things because I cannot afford anything else! " + discount); }
        });

        discountEventLambda.notifyObservers(30);

    }
}
