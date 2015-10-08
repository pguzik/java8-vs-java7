package filter;

/**
 * @author Piotrek
 */
public class FurnitureRedColorPredicate implements FurniturePredicate {
    @Override
    public boolean test(Furniture furniture) {
        return "red".equals(furniture.getColor());
    }
}
