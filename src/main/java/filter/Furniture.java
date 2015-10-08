package filter;

/**
 * @author Piotrek
 */
public class Furniture {
    private Integer price = 0;
    private String color = "";

    public Furniture(Integer price, String color){
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
