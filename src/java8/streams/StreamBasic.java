package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {

    public static void main(String...args){
        getLowPriceFurnitureNameJava7(Furniture.magazine).forEach(System.out::println);
        System.out.println("---");
        getLowPriceFurnitureNameJava8(Furniture.magazine).forEach(System.out::println);
    }

    public static List<String> getLowPriceFurnitureNameJava7(List<Furniture> magazine){
        List<Furniture> lowPriceFurniture = new ArrayList<>();
        for(Furniture furniture: magazine){
            if(furniture.getPrice() < 500){
                lowPriceFurniture.add(furniture);
            }
        }
        List<String> lowPriceFurnitureNames = new ArrayList<>();
        Collections.sort(lowPriceFurniture, new Comparator<Furniture>() {
            public int compare(Furniture f1, Furniture f2){
                return Integer.compare(f1.getPrice(), f2.getPrice());
            }
        });
        for(Furniture furniture: lowPriceFurniture){
            lowPriceFurnitureNames.add(furniture.getName());
        }
        return lowPriceFurnitureNames;
    }

    public static List<String> getLowPriceFurnitureNameJava8(List<Furniture> magazine){
        return magazine.stream()
                .filter(f -> f.getPrice() < 500)
                .sorted(comparing(Furniture::getPrice))
                .map(Furniture::getName)
                .collect(toList());
    }
}
