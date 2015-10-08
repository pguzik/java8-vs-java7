package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Piotrek
 */
public class Filtering {

	public static void main(String ... args){

		List<Furniture> furniture = new ArrayList<>();
		furniture.addAll(Arrays.asList(new Furniture(800, "black"), new Furniture(1600, "red"), new Furniture(700, "white"),
			new Furniture(3000, "rainbow"), new Furniture(2500, "pink"), new Furniture(1500, "old-super-stylish")));

		List<Furniture> redFurnitures = filterRedFurniture(furniture);
		System.out.println(redFurnitures);

		List<Furniture> rainbowFurnitures = filterFurnitureByColor(furniture, "rainbow");
		System.out.println(rainbowFurnitures);

		List<Furniture> redFurniture2 = filter(furniture, new FurnitureRedColorPredicate());
		System.out.println(redFurniture2);

		List<Furniture> expensiveFurniture = filter(furniture, new FurnitureTooExpensivePricePredicate());
		System.out.println(expensiveFurniture);

		List<Furniture> redAndExpensiveFurniture = filter(furniture, new FurnitureRedAndExpensivePredicate());
		System.out.println(redAndExpensiveFurniture);

		List<Furniture> redFurniture3 = filter(furniture, new FurniturePredicate() {
			public boolean test(Furniture f){
				return f.getColor().equals("red");
			}
		});
		System.out.println(redFurniture3);

	}

	public static List<Furniture> filterRedFurniture(List<Furniture> furniture){
		List<Furniture> result = new ArrayList<>();
		for(Furniture f : furniture){
			if("red".equals(f.getColor())){
				result.add(f);
			}
		}
		return result;
	}

	public static List<Furniture> filterFurnitureByColor(List<Furniture> furniture, String color){
		List<Furniture> result = new ArrayList<>();
		for(Furniture f : furniture){
			if(f.getColor().equals(color)){
				result.add(f);
			}
		}
		return result;
	}

	public static List<Furniture> filterFurnitureByPrice(List<Furniture> furniture, int price){
		List<Furniture> result = new ArrayList<>();
		for(Furniture f : furniture){
			if(f.getPrice() > price){
				result.add(f);
			}
		}
		return result;
	}


	public static List<Furniture> filter(List<Furniture> furniture, FurniturePredicate p){
		List<Furniture> result = new ArrayList<>();
		for(Furniture f : furniture){
			if(p.test(f)){
				result.add(f);
			}
		}
		return result;
	}
}