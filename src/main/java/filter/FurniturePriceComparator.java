package filter;

import java.util.Comparator;

/**
 * @author Piotrek
 */
public class FurniturePriceComparator implements Comparator<Furniture> {
    @Override
    public int compare(Furniture f1, Furniture f2) {
        return f1.getPrice().compareTo(f2.getPrice());
    }
}
