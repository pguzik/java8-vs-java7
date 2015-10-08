package patterns.factory;

import java.util.function.Supplier;


public class FactoryMain {

    public static void main(String[] args) {
        Furniture furniture1 = FurnitureFactoryJava7.createFurniture("table");

        Supplier<Furniture> furnitureSupplier = Bed::new;
        Furniture furniture2 = furnitureSupplier.get();

        Furniture furniture3 = FurnitureFactoryJava8.createFurniture("table");
    }
}
