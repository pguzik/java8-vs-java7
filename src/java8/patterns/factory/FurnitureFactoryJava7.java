package java8.patterns.factory;

/**
 * @author Piotrek
 */
public class FurnitureFactoryJava7 {
    public static Furniture createFurniture(String name){
        switch(name){
            case "table": return new Table();
            case "bed": return new Bed();
            case "wardrobe": return new Wardrobe();
            default: throw new RuntimeException("No such furniture " + name);
        }
    }
}
