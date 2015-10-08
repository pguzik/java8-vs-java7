package java8.filter;

/**
 * @author Piotrek
 */
public class FurnitureRedAndExpensivePredicate implements FurniturePredicate {
    @Override
    public boolean test(Furniture furniture) {
        return new FurnitureRedColorPredicate().test(furniture)
                && new FurnitureTooExpensivePricePredicate().test(furniture);
    }
}
