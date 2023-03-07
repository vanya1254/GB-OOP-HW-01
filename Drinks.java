public class Drinks extends Product {
    protected Double volume;

    public Drinks(String name, Integer price, Integer quantity, String unit, Double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Product -> Drinks{ name=%s, price=%d, quantity=%d, unit=%s, volume=%2.1f }", name, price, quantity,
                unit, volume);
    }
}