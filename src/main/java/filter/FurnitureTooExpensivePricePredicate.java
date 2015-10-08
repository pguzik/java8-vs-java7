package filter;

/**
 * @author Piotrek
 */
public class FurnitureTooExpensivePricePredicate implements FurniturePredicate {
    @Override
    public boolean test(Furniture furniture) {
        return furniture.getPrice() > 1500;
    }
}
