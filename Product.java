import java.util.Arrays;

public class Product {
    protected String name;
    protected Integer price;
    protected Integer quantity;
    protected String unit;

    public Product(String name, Integer price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("Product{ name=%s, price=%d, quantity=%d, unit=%s }", name, price, quantity, unit);
    }
}