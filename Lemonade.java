public class Lemonade extends Drinks {

    public Lemonade(String name, Integer price, Integer quantity, String unit, Double volume) {
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return String.format("Product -> Drinks -> Lemonade{ name=%s, price=%d, quantity=%d, unit=%s, volume=%2.1f }", name, price, quantity,
                unit, volume);
    }
}