package java8.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author Piotrek
 */
public class Sorting {

    public static void main(String...args){

        List<Furniture> furniture = new ArrayList<>();
        furniture.addAll(Arrays.asList(new Furniture(800, "black"), new Furniture(1000, "red"), new Furniture(700, "white")));

        furniture.sort(new FurniturePriceComparator());
        System.out.println(furniture);

        furniture.add(new Furniture(3000, "rainbow"));

            furniture.sort(new Comparator<Furniture>() {
                public int compare(Furniture f1, Furniture f2) {
                    return f1.getPrice().compareTo(f2.getPrice());
                }
            });
        System.out.println(furniture);

        furniture.add(new Furniture(2500, "pink"));

        furniture.sort((f1, f2) -> f1.getPrice().compareTo(f2.getPrice()));
        System.out.println(furniture);

        furniture.add(new Furniture(1500, "old-super-stylish"));

        furniture.sort(comparing(Furniture::getPrice));
        System.out.println(furniture);
    }
}
