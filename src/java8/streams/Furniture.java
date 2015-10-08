package java8.streams;

import java.util.Arrays;
import java.util.List;

import static java8.streams.Furniture.Type.*;

public class Furniture {

    private final String name;
    private final boolean isPretty;
    private final int price;
    private final Type type;

    public Furniture(String name, boolean isPretty, int price, Type type) {
        this.name = name;
        this.isPretty = isPretty;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isPretty() {
        return isPretty;
    }

    public int getPrice() {
        return price;
    }

    public enum Type { KITCHEN, BEDROOM, LIVING_ROOM }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Furniture> magazine =
            Arrays.asList( new Furniture("microvawe-oven", false, 200, KITCHEN),
                           new Furniture("fridge", false, 500, KITCHEN),
                           new Furniture("bed", true, 1000, BEDROOM),
                           new Furniture("glass-wardrobe", true, 2000, BEDROOM),
                           new Furniture("sofa", true, 3500, LIVING_ROOM),
                           new Furniture("coffee-table", true, 450, LIVING_ROOM),
                           new Furniture("chair", false, 550, LIVING_ROOM),
                           new Furniture("PS4", true, 800, LIVING_ROOM),
                           new Furniture("bookshelf", false, 450, LIVING_ROOM));
}