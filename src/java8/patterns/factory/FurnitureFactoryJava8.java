package java8.patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author Piotrek
 */
public class FurnitureFactoryJava8 {
    final static private Map<String, Supplier<Furniture>> map = new HashMap<>();
    static {
        map.put("table", Table::new);
        map.put("bed", Bed::new);
        map.put("wardrobe", Wardrobe::new);
    }

    public static Furniture createFurniture(String name){
        Supplier<Furniture> furnitureSupplier = map.get(name);
        if(furnitureSupplier != null) {
            return furnitureSupplier.get();
        }
        throw new RuntimeException("No such furniture " + name);
    }
}
